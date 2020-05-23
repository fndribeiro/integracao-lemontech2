/**
 * ParametrizacoesEspecificas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacoesEspecificas  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef[] parametrizacoesSolicitacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef[] parametrizacoesAprovacao;

    public ParametrizacoesEspecificas() {
    }

    public ParametrizacoesEspecificas(
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef[] parametrizacoesSolicitacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef[] parametrizacoesAprovacao) {
           this.parametrizacoesSolicitacao = parametrizacoesSolicitacao;
           this.parametrizacoesAprovacao = parametrizacoesAprovacao;
    }


    /**
     * Gets the parametrizacoesSolicitacao value for this ParametrizacoesEspecificas.
     * 
     * @return parametrizacoesSolicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef[] getParametrizacoesSolicitacao() {
        return parametrizacoesSolicitacao;
    }


    /**
     * Sets the parametrizacoesSolicitacao value for this ParametrizacoesEspecificas.
     * 
     * @param parametrizacoesSolicitacao
     */
    public void setParametrizacoesSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef[] parametrizacoesSolicitacao) {
        this.parametrizacoesSolicitacao = parametrizacoesSolicitacao;
    }


    /**
     * Gets the parametrizacoesAprovacao value for this ParametrizacoesEspecificas.
     * 
     * @return parametrizacoesAprovacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef[] getParametrizacoesAprovacao() {
        return parametrizacoesAprovacao;
    }


    /**
     * Sets the parametrizacoesAprovacao value for this ParametrizacoesEspecificas.
     * 
     * @param parametrizacoesAprovacao
     */
    public void setParametrizacoesAprovacao(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef[] parametrizacoesAprovacao) {
        this.parametrizacoesAprovacao = parametrizacoesAprovacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacoesEspecificas)) return false;
        ParametrizacoesEspecificas other = (ParametrizacoesEspecificas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametrizacoesSolicitacao==null && other.getParametrizacoesSolicitacao()==null) || 
             (this.parametrizacoesSolicitacao!=null &&
              java.util.Arrays.equals(this.parametrizacoesSolicitacao, other.getParametrizacoesSolicitacao()))) &&
            ((this.parametrizacoesAprovacao==null && other.getParametrizacoesAprovacao()==null) || 
             (this.parametrizacoesAprovacao!=null &&
              java.util.Arrays.equals(this.parametrizacoesAprovacao, other.getParametrizacoesAprovacao())));
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
        if (getParametrizacoesSolicitacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametrizacoesSolicitacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametrizacoesSolicitacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParametrizacoesAprovacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametrizacoesAprovacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametrizacoesAprovacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametrizacoesEspecificas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacoesEspecificas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacoesSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacoesSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacaoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoSolicitacaoRef"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacoesAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacoesAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacaoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoAprovacaoRef"));
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
