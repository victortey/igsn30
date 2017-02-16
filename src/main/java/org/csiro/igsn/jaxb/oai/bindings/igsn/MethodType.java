//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.16 at 10:36:31 AM AWST 
//


package org.csiro.igsn.jaxb.oai.bindings.igsn;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for methodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="methodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Blast"/>
 *     &lt;enumeration value="Corer"/>
 *     &lt;enumeration value="Corer:Box"/>
 *     &lt;enumeration value="Corer:Drill"/>
 *     &lt;enumeration value="Corer:FreeFall"/>
 *     &lt;enumeration value="Corer:Gravity"/>
 *     &lt;enumeration value="Corer:Gravity,Giant"/>
 *     &lt;enumeration value="Corer:Kastenlot"/>
 *     &lt;enumeration value="Corer:Multi"/>
 *     &lt;enumeration value="Corer:Piston"/>
 *     &lt;enumeration value="Corer:Piston,Giant"/>
 *     &lt;enumeration value="Corer:Rock"/>
 *     &lt;enumeration value="Corer:SideSaddle"/>
 *     &lt;enumeration value="Corer:TriggerWeight"/>
 *     &lt;enumeration value="Corer:Vibrating"/>
 *     &lt;enumeration value="Dredge"/>
 *     &lt;enumeration value="Dredge:ChainBag"/>
 *     &lt;enumeration value="Dredge:Scallop"/>
 *     &lt;enumeration value="Grab"/>
 *     &lt;enumeration value="Hand"/>
 *     &lt;enumeration value="Hand:Auger"/>
 *     &lt;enumeration value="Hand:Hammer"/>
 *     &lt;enumeration value="Hand:Knife"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Net:MOCNESS"/>
 *     &lt;enumeration value="Probe"/>
 *     &lt;enumeration value="Scoop"/>
 *     &lt;enumeration value="Trap"/>
 *     &lt;enumeration value="Trawl"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "methodType")
@XmlEnum
public enum MethodType {

    @XmlEnumValue("Blast")
    BLAST("Blast"),
    @XmlEnumValue("Corer")
    CORER("Corer"),
    @XmlEnumValue("Corer:Box")
    CORER_BOX("Corer:Box"),
    @XmlEnumValue("Corer:Drill")
    CORER_DRILL("Corer:Drill"),
    @XmlEnumValue("Corer:FreeFall")
    CORER_FREE_FALL("Corer:FreeFall"),
    @XmlEnumValue("Corer:Gravity")
    CORER_GRAVITY("Corer:Gravity"),
    @XmlEnumValue("Corer:Gravity,Giant")
    CORER_GRAVITY_GIANT("Corer:Gravity,Giant"),
    @XmlEnumValue("Corer:Kastenlot")
    CORER_KASTENLOT("Corer:Kastenlot"),
    @XmlEnumValue("Corer:Multi")
    CORER_MULTI("Corer:Multi"),
    @XmlEnumValue("Corer:Piston")
    CORER_PISTON("Corer:Piston"),
    @XmlEnumValue("Corer:Piston,Giant")
    CORER_PISTON_GIANT("Corer:Piston,Giant"),
    @XmlEnumValue("Corer:Rock")
    CORER_ROCK("Corer:Rock"),
    @XmlEnumValue("Corer:SideSaddle")
    CORER_SIDE_SADDLE("Corer:SideSaddle"),
    @XmlEnumValue("Corer:TriggerWeight")
    CORER_TRIGGER_WEIGHT("Corer:TriggerWeight"),
    @XmlEnumValue("Corer:Vibrating")
    CORER_VIBRATING("Corer:Vibrating"),
    @XmlEnumValue("Dredge")
    DREDGE("Dredge"),
    @XmlEnumValue("Dredge:ChainBag")
    DREDGE_CHAIN_BAG("Dredge:ChainBag"),
    @XmlEnumValue("Dredge:Scallop")
    DREDGE_SCALLOP("Dredge:Scallop"),
    @XmlEnumValue("Grab")
    GRAB("Grab"),
    @XmlEnumValue("Hand")
    HAND("Hand"),
    @XmlEnumValue("Hand:Auger")
    HAND_AUGER("Hand:Auger"),
    @XmlEnumValue("Hand:Hammer")
    HAND_HAMMER("Hand:Hammer"),
    @XmlEnumValue("Hand:Knife")
    HAND_KNIFE("Hand:Knife"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Net:MOCNESS")
    NET_MOCNESS("Net:MOCNESS"),
    @XmlEnumValue("Probe")
    PROBE("Probe"),
    @XmlEnumValue("Scoop")
    SCOOP("Scoop"),
    @XmlEnumValue("Trap")
    TRAP("Trap"),
    @XmlEnumValue("Trawl")
    TRAWL("Trawl"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodType fromValue(String v) {
        for (MethodType c: MethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
