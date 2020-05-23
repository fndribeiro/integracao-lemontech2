/**
 * ContabilizarRelatorioDespesasRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class ContabilizarRelatorioDespesasRequest  implements java.io.Serializable {
    private java.lang.String version;

    private int idSolicitacao;

    private int idRelatorioDespesas;

    private java.util.Date dataContabilizacao;

    private boolean status;

    private java.lang.String numeroAutorizacao;

    private java.lang.String observacaoContabilizacao;

    public ContabilizarRelatorioDespesasRequest() {
    }

    public ContabilizarRelatorioDespesasRequest(
           java.lang.String version,
           int idSolicitacao,
           int idRelatorioDespesas,
           java.util.Date dataContabilizacao,
           boolean status,
           java.lang.String numeroAutorizacao,
           java.lang.String observacaoContabilizacao) {
           this.version = version;
           this.idSolicitacao = idSolicitacao;
           this.idRelatorioDespesas = idRelatorioDespesas;
           this.dataContabilizacao = dataContabilizacao;
           this.status = status;
           this.numeroAutorizacao = numeroAutorizacao;
           this.observacaoContabilizacao = observacaoContabilizacao;
    }


    /**
     * Gets the version value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the idSolicitacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return idSolicitacao
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }


    /**
     * Sets the idSolicitacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param idSolicitacao
     */
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }


    /**
     * Gets the idRelatorioDespesas value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return idRelatorioDespesas
     */
    public int getIdRelatorioDespesas() {
        return idRelatorioDespesas;
    }


    /**
     * Sets the idRelatorioDespesas value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param idRelatorioDespesas
     */
    public void setIdRelatorioDespesas(int idRelatorioDespesas) {
        this.idRelatorioDespesas = idRelatorioDespesas;
    }


    /**
     * Gets the dataContabilizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return dataContabilizacao
     */
    public java.util.Date getDataContabilizacao() {
        return dataContabilizacao;
    }


    /**
     * Sets the dataContabilizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param dataContabilizacao
     */
    public void setDataContabilizacao(java.util.Date dataContabilizacao) {
        this.dataContabilizacao = dataContabilizacao;
    }


    /**
     * Gets the status value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the numeroAutorizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return numeroAutorizacao
     */
    public java.lang.String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }


    /**
     * Sets the numeroAutorizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param numeroAutorizacao
     */
    public void setNumeroAutorizacao(java.lang.String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }


    /**
     * Gets the observacaoContabilizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @return observacaoContabilizacao
     */
    public java.lang.String getObservacaoContabilizacao() {
        return observacaoContabilizacao;
    }


    /**
     * Sets the observacaoContabilizacao value for this ContabilizarRelatorioDespesasRequest.
     * 
     * @param observacaoContabilizacao
     */
    public void setObservacaoContabilizacao(java.lang.String observacaoContabilizacao) {
        this.observacaoContabilizacao = observacaoContabilizacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContabilizarRelatorioDespesasRequest)) return false;
        ContabilizarRelatorioDespesasRequest other = (ContabilizarRelatorioDespesasRequest) obj;
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
            this.idSolicitacao == other.getIdSolicitacao() &&
            this.idRelatorioDespesas == other.getIdRelatorioDespesas() &&
            ((this.dataContabilizacao==null && other.getDataContabilizacao()==null) || 
             (this.dataContabilizacao!=null &&
              this.dataContabilizacao.equals(other.getDataContabilizacao()))) &&
            this.status == other.isStatus() &&
            ((this.numeroAutorizacao==null && other.getNumeroAutorizacao()==null) || 
             (this.numeroAutorizacao!=null &&
              this.numeroAutorizacao.equals(other.getNumeroAutorizacao()))) &&
            ((this.observacaoContabilizacao==null && other.getObservacaoContabilizacao()==null) || 
             (this.observacaoContabilizacao!=null &&
              this.observacaoContabilizacao.equals(other.getObservacaoContabilizacao())));
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
        _hashCode += getIdSolicitacao();
        _hashCode += getIdRelatorioDespesas();
        if (getDataContabilizacao() != null) {
            _hashCode += getDataContabilizacao().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNumeroAutorizacao() != null) {
            _hashCode += getNumeroAutorizacao().hashCode();
        }
        if (getObservacaoContabilizacao() != null) {
            _hashCode += getObservacaoContabilizacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContabilizarRelatorioDespesasRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "contabilizarRelatorioDespesasRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRelatorioDespesas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRelatorioDespesas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataContabilizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataContabilizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAutorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAutorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacaoContabilizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacaoContabilizacao"));
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
