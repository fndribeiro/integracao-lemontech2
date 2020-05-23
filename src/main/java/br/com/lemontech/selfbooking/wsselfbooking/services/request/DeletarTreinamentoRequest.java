/**
 * DeletarTreinamentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class DeletarTreinamentoRequest  implements java.io.Serializable {
    private java.lang.String codigoTreinamento;

    public DeletarTreinamentoRequest() {
    }

    public DeletarTreinamentoRequest(
           java.lang.String codigoTreinamento) {
           this.codigoTreinamento = codigoTreinamento;
    }


    /**
     * Gets the codigoTreinamento value for this DeletarTreinamentoRequest.
     * 
     * @return codigoTreinamento
     */
    public java.lang.String getCodigoTreinamento() {
        return codigoTreinamento;
    }


    /**
     * Sets the codigoTreinamento value for this DeletarTreinamentoRequest.
     * 
     * @param codigoTreinamento
     */
    public void setCodigoTreinamento(java.lang.String codigoTreinamento) {
        this.codigoTreinamento = codigoTreinamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletarTreinamentoRequest)) return false;
        DeletarTreinamentoRequest other = (DeletarTreinamentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoTreinamento==null && other.getCodigoTreinamento()==null) || 
             (this.codigoTreinamento!=null &&
              this.codigoTreinamento.equals(other.getCodigoTreinamento())));
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
        if (getCodigoTreinamento() != null) {
            _hashCode += getCodigoTreinamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletarTreinamentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarTreinamentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTreinamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTreinamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
