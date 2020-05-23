/**
 * PesquisarRelatorioDespesasRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class PesquisarRelatorioDespesasRequest  implements java.io.Serializable {
    private java.lang.String version;

    private java.util.Calendar dataInicial;

    private java.util.Calendar dataFinal;

    private int registroInicial;

    private java.lang.Integer quantidadeRegistros;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status;

    public PesquisarRelatorioDespesasRequest() {
    }

    public PesquisarRelatorioDespesasRequest(
           java.lang.String version,
           java.util.Calendar dataInicial,
           java.util.Calendar dataFinal,
           int registroInicial,
           java.lang.Integer quantidadeRegistros,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status) {
           this.version = version;
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.registroInicial = registroInicial;
           this.quantidadeRegistros = quantidadeRegistros;
           this.status = status;
    }


    /**
     * Gets the version value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the dataInicial value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return dataInicial
     */
    public java.util.Calendar getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.util.Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return dataFinal
     */
    public java.util.Calendar getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.util.Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the registroInicial value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return registroInicial
     */
    public int getRegistroInicial() {
        return registroInicial;
    }


    /**
     * Sets the registroInicial value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param registroInicial
     */
    public void setRegistroInicial(int registroInicial) {
        this.registroInicial = registroInicial;
    }


    /**
     * Gets the quantidadeRegistros value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return quantidadeRegistros
     */
    public java.lang.Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }


    /**
     * Sets the quantidadeRegistros value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param quantidadeRegistros
     */
    public void setQuantidadeRegistros(java.lang.Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }


    /**
     * Gets the status value for this PesquisarRelatorioDespesasRequest.
     * 
     * @return status
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PesquisarRelatorioDespesasRequest.
     * 
     * @param status
     */
    public void setStatus(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarRelatorioDespesasRequest)) return false;
        PesquisarRelatorioDespesasRequest other = (PesquisarRelatorioDespesasRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            this.registroInicial == other.getRegistroInicial() &&
            ((this.quantidadeRegistros==null && other.getQuantidadeRegistros()==null) || 
             (this.quantidadeRegistros!=null &&
              this.quantidadeRegistros.equals(other.getQuantidadeRegistros()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        _hashCode += getRegistroInicial();
        if (getQuantidadeRegistros() != null) {
            _hashCode += getQuantidadeRegistros().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarRelatorioDespesasRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarRelatorioDespesasRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registroInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadeRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "presacaoContasStatus"));
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
