/**
 * DelegarTodasParametrizacoes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class DelegarTodasParametrizacoes  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao tipoParametrizacao;

    public DelegarTodasParametrizacoes() {
    }

    public DelegarTodasParametrizacoes(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao tipoParametrizacao) {
           this.tipoParametrizacao = tipoParametrizacao;
    }


    /**
     * Gets the tipoParametrizacao value for this DelegarTodasParametrizacoes.
     * 
     * @return tipoParametrizacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao getTipoParametrizacao() {
        return tipoParametrizacao;
    }


    /**
     * Sets the tipoParametrizacao value for this DelegarTodasParametrizacoes.
     * 
     * @param tipoParametrizacao
     */
    public void setTipoParametrizacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao tipoParametrizacao) {
        this.tipoParametrizacao = tipoParametrizacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelegarTodasParametrizacoes)) return false;
        DelegarTodasParametrizacoes other = (DelegarTodasParametrizacoes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoParametrizacao==null && other.getTipoParametrizacao()==null) || 
             (this.tipoParametrizacao!=null &&
              this.tipoParametrizacao.equals(other.getTipoParametrizacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTipoParametrizacao() != null) {
            _hashCode += getTipoParametrizacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelegarTodasParametrizacoes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "delegarTodasParametrizacoes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoParametrizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoParametrizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoParametrizacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
