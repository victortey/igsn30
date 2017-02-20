//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.20 at 03:33:16 PM AWST 
//


package org.csiro.igsn.jaxb.oai.bindings.igsn;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for featureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="featureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/borehole/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/crossSection/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/CTD/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/depthInterval/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/excavation/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/fieldArea/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/flightline/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/interval/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/observationWell/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/profile/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/quadrat/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/scene/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/shipsTrack/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/site/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/soilPitSection/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/specimen/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/streamGage/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/trajectory/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/transect/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/traverse/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/waterQualityStation/"/>
 *     &lt;enumeration value="http://vocabulary.odm2.org/samplingfeaturetype/weatherStation/"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "featureType")
@XmlEnum
public enum FeatureType {

    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/borehole/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_BOREHOLE("http://vocabulary.odm2.org/samplingfeaturetype/borehole/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/crossSection/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_CROSS_SECTION("http://vocabulary.odm2.org/samplingfeaturetype/crossSection/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/CTD/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_CTD("http://vocabulary.odm2.org/samplingfeaturetype/CTD/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/depthInterval/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_DEPTH_INTERVAL("http://vocabulary.odm2.org/samplingfeaturetype/depthInterval/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/excavation/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_EXCAVATION("http://vocabulary.odm2.org/samplingfeaturetype/excavation/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/fieldArea/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_FIELD_AREA("http://vocabulary.odm2.org/samplingfeaturetype/fieldArea/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/flightline/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_FLIGHTLINE("http://vocabulary.odm2.org/samplingfeaturetype/flightline/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/interval/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_INTERVAL("http://vocabulary.odm2.org/samplingfeaturetype/interval/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/observationWell/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_OBSERVATION_WELL("http://vocabulary.odm2.org/samplingfeaturetype/observationWell/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/profile/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_PROFILE("http://vocabulary.odm2.org/samplingfeaturetype/profile/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/quadrat/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_QUADRAT("http://vocabulary.odm2.org/samplingfeaturetype/quadrat/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/scene/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_SCENE("http://vocabulary.odm2.org/samplingfeaturetype/scene/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/shipsTrack/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_SHIPS_TRACK("http://vocabulary.odm2.org/samplingfeaturetype/shipsTrack/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/site/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_SITE("http://vocabulary.odm2.org/samplingfeaturetype/site/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/soilPitSection/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_SOIL_PIT_SECTION("http://vocabulary.odm2.org/samplingfeaturetype/soilPitSection/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/specimen/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_SPECIMEN("http://vocabulary.odm2.org/samplingfeaturetype/specimen/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/streamGage/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_STREAM_GAGE("http://vocabulary.odm2.org/samplingfeaturetype/streamGage/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/trajectory/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_TRAJECTORY("http://vocabulary.odm2.org/samplingfeaturetype/trajectory/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/transect/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_TRANSECT("http://vocabulary.odm2.org/samplingfeaturetype/transect/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/traverse/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_TRAVERSE("http://vocabulary.odm2.org/samplingfeaturetype/traverse/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/waterQualityStation/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_WATER_QUALITY_STATION("http://vocabulary.odm2.org/samplingfeaturetype/waterQualityStation/"),
    @XmlEnumValue("http://vocabulary.odm2.org/samplingfeaturetype/weatherStation/")
    HTTP_VOCABULARY_ODM_2_ORG_SAMPLINGFEATURETYPE_WEATHER_STATION("http://vocabulary.odm2.org/samplingfeaturetype/weatherStation/");
    private final String value;

    FeatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureType fromValue(String v) {
        for (FeatureType c: FeatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
