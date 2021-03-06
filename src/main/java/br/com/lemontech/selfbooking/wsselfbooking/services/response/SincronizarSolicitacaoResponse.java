/**
 * SincronizarSolicitacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class SincronizarSolicitacaoResponse  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao;

    private java.lang.String mensagemRetorno;

    public SincronizarSolicitacaoResponse() {
    }

    public SincronizarSolicitacaoResponse(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao,
           java.lang.String mensagemRetorno) {
           this.resultadoAcao = resultadoAcao;
           this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the resultadoAcao value for this SincronizarSolicitacaoResponse.
     * 
     * @return resultadoAcao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }


    /**
     * Sets the resultadoAcao value for this SincronizarSolicitacaoResponse.
     * 
     * @param resultadoAcao
     */
    public void setResultadoAcao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao) {
        this.resultadoAcao = resultadoAcao;
    }


    /**
     * Gets the mensagemRetorno value for this SincronizarSolicitacaoResponse.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this SincronizarSolicitacaoResponse.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SincronizarSolicitacaoResponse)) return false;
        SincronizarSolicitacaoResponse other = (SincronizarSolicitacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoAcao==null && other.getResultadoAcao()==null) || 
             (this.resultadoAcao!=null &&
              this.resultadoAcao.equals(other.getResultadoAcao()))) &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno())));
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
        if (getResultadoAcao() != null) {
            _hashCode += getResultadoAcao().hashCode();
        }
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SincronizarSolicitacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "sincronizarSolicitacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoAcao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoAcao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
