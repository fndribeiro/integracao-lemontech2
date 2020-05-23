/**
 * CriarPreSolicitacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class CriarPreSolicitacaoResponse  implements java.io.Serializable {
    private java.lang.String urlPreSolicitacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao;

    public CriarPreSolicitacaoResponse() {
    }

    public CriarPreSolicitacaoResponse(
           java.lang.String urlPreSolicitacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao) {
           this.urlPreSolicitacao = urlPreSolicitacao;
           this.resultadoOperacao = resultadoOperacao;
    }


    /**
     * Gets the urlPreSolicitacao value for this CriarPreSolicitacaoResponse.
     * 
     * @return urlPreSolicitacao
     */
    public java.lang.String getUrlPreSolicitacao() {
        return urlPreSolicitacao;
    }


    /**
     * Sets the urlPreSolicitacao value for this CriarPreSolicitacaoResponse.
     * 
     * @param urlPreSolicitacao
     */
    public void setUrlPreSolicitacao(java.lang.String urlPreSolicitacao) {
        this.urlPreSolicitacao = urlPreSolicitacao;
    }


    /**
     * Gets the resultadoOperacao value for this CriarPreSolicitacaoResponse.
     * 
     * @return resultadoOperacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }


    /**
     * Sets the resultadoOperacao value for this CriarPreSolicitacaoResponse.
     * 
     * @param resultadoOperacao
     */
    public void setResultadoOperacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao) {
        this.resultadoOperacao = resultadoOperacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarPreSolicitacaoResponse)) return false;
        CriarPreSolicitacaoResponse other = (CriarPreSolicitacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.urlPreSolicitacao==null && other.getUrlPreSolicitacao()==null) || 
             (this.urlPreSolicitacao!=null &&
              this.urlPreSolicitacao.equals(other.getUrlPreSolicitacao()))) &&
            ((this.resultadoOperacao==null && other.getResultadoOperacao()==null) || 
             (this.resultadoOperacao!=null &&
              this.resultadoOperacao.equals(other.getResultadoOperacao())));
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
        if (getUrlPreSolicitacao() != null) {
            _hashCode += getUrlPreSolicitacao().hashCode();
        }
        if (getResultadoOperacao() != null) {
            _hashCode += getResultadoOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriarPreSolicitacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "criarPreSolicitacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlPreSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlPreSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoOperacao"));
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
