/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IoModule complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IoModule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://esg.dell.com/icee/infrastructure/model/storage}DetailBase">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IoModule", propOrder = { "position" })
public class IoModule extends DetailBase {

    protected long position;


    /**
     * Gets the value of the position property.
     * 
     */
    public long getPosition() {
        return position;
    }


    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(long value) {
        this.position = value;
    }

}