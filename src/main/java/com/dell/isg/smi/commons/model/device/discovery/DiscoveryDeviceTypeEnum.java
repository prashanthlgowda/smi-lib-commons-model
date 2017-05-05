/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery;

public enum DiscoveryDeviceTypeEnum {

    IDRAC6, IDRAC7, IDRAC8, CMC, CMC_FX2, CSERVER, VRTX, VCENTER, FORCE10_S4810, FORCE10_S5000, FORCE10_S6000, FORCE10_S4048, FORCE10_S55, FORCE10IOM, FX2_IOM, DELL_IOM_84, BROCADE, POWERCONNECT, POWERCONNECT_N3000, POWERCONNECT_N4000, CISCONEXUS, EQUALLOGIC_NODISCOVER, EM_COMPELLENT, EQUALLOGIC, COMPELLENT, UNKNOWN;

    public String value() {
        return name();
    }


    public static DiscoveryDeviceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}