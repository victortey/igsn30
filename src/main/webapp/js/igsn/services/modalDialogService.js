app.service('modalService', ['$uibModal','$sce','$location',function ($uibModal,$sce,$location) {

      var modalDefaults = {
          backdrop: true,
          keyboard: true,
          modalFade: true,
          templateUrl: 'widget/modal.html'
      };

      var modalOptions = {
          closeButtonText: 'Close',
          actionButtonText: 'OK',
          headerText: 'Proceed?',
          bodyText: 'Perform this action?'
      };

      this.showModal = function (customModalDefaults, customModalOptions) {
          if (!customModalDefaults) customModalDefaults = {};
          customModalDefaults.backdrop = 'static';
          return this.show(customModalDefaults, customModalOptions);
      };

      this.show = function (customModalDefaults, customModalOptions) {
          //Create temp objects to work with since we're in a singleton service
          var tempModalDefaults = {};
          var tempModalOptions = {};

          //Map angular-ui modal custom defaults to modal defaults defined in service
          angular.extend(tempModalDefaults, modalDefaults, customModalDefaults);

          //Map modal.html $scope custom properties to defaults defined in service
          angular.extend(tempModalOptions, modalOptions, customModalOptions);

          if (!tempModalDefaults.controller) {
              tempModalDefaults.controller = function ($scope, $uibModalInstance) {
                  $scope.modalOptions = tempModalOptions;
                  $scope.modalOptions.ok = function (result) {
                	  $uibModalInstance.close(result);
                  };
                  $scope.modalOptions.bodyText = $sce.trustAsHtml($scope.modalOptions.bodyText);
                  $scope.modalOptions.close = function (result) {
                	  $uibModalInstance.dismiss('cancel');
                  };
                  
                  if($scope.modalOptions.redirect){
                	  $scope.modalOptions.redirectFnc = function () {
                    	  $location.path($scope.modalOptions.redirect);
                    	  $uibModalInstance.close(result);
                      };
                  }
                  
              }
          }

          return $uibModal.open(tempModalDefaults).result;
      };

  }]);