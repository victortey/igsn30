

app.service('selectListService', ['$q','$http',function($q,$http) {

	this.getResourceType = function(){
    	  return [
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/automated",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/core",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreHalfRound",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/corePiece",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreQuarterRound",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreSection",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreSectionHalf",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreSub-Piece",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/coreWholeRound",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/cuttings",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/dredge",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/foliageDigestion",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/foliageLeaching",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/forestFloorDigestion",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/grab",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/individualSample",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/litterFallDigestion",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/orientedCore",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/other",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/petriDishDryDeposition",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/precipitationBulk",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/rockPowder",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/standardReferenceSpecimen",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/terrestrialSection",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/thinSection",
				"http://www.opengis.net/def/nil/OGC/0/inapplicable",
				"http://www.opengis.net/def/nil/OGC/0/missing",
				"http://www.opengis.net/def/nil/OGC/0/template",
				"http://www.opengis.net/def/nil/OGC/0/unknown",
				"http://www.opengis.net/def/nil/OGC/0/withheld"
    	          ];
      };
      
      this.getMaterialType = function(){
    	  return [
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/air",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/gas",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/habitat",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ice",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/liquidAqueous",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/liquidOrganic",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/mineral",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/notApplicable",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/organism",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/other",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/particulate",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/regolith",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/rock",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/sediment",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/snow",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/soil",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/tissue",
				"http://www.opengis.net/def/nil/OGC/0/inapplicable",
				"http://www.opengis.net/def/nil/OGC/0/missing",
				"http://www.opengis.net/def/nil/OGC/0/template",
				"http://www.opengis.net/def/nil/OGC/0/unknown",
				"http://www.opengis.net/def/nil/OGC/0/withheld"
    	          ];
      };
      
      this.getEpsg = function(){
    	  return [
				"https://epsg.io/3112",
				"https://epsg.io/4283",
				"https://epsg.io/4326",
				"https://epsg.io/4939",
				"https://epsg.io/5711",
				"https://epsg.io/5712",
				"https://epsg.io/8311"
    	          ];
      };
      
      this.getIdentifierType = function(){
    	  return [
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ARK",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/arXiv",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/bibcode",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/DOI",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/EAN13",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/EISSN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/Handle",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IGSN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ISBN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ISNI",				
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ISSN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ISTC",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/LISSN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/LSID",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/ORCID",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/PMID",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/PURL",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/UPC",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/URL",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/URN",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/VIAF"
    	          ];
      };
      
      
      this.getContributorType = function(){
    	  return [
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/collaborator",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/contributor",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/custodian",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/funder",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/originator",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/owner",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/pointOfContact",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/principalInvestigator",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/processor",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/rightsHolder",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/sponsor",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/stakeholder",
				"http://registry.it.csiro.au/def/isotc211/CI_RoleCode/user"
      	          ];
      };
      
      this.getRelationType = function(){
    	  return [
  				
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/HasDigitalRepresentation",  			
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/HasReferenceResource",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/HasSamplingFeature",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsAggregateOf",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsDerivedFrom",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsDigitalRepresentationOf",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsDocumentedBy",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsIdenticalTo",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsMemberOf",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsSamplingFeatureOf",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/IsSourceOf",
  				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/Participates"
        	          ];
      }
      
      
      this.registeredObjectType = function(){
    	  return [
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/PhysicalSample",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/SampleCollection",
				"http://pid.geoscience.gov.au/def/voc/igsn-codelists/SamplingFeature"
      	          ];
      }
      
      this.getTrueFalse = function(){
    	  return [
				"true",
				"false"
    	          ];
     }
      
      this.getMGAZone = function(){
    	  return [
				"49",
				"50",
				"51",
				"52",
				"53",
				"54",
				"55",
				"56"
  	          ];
      }
      
}]);