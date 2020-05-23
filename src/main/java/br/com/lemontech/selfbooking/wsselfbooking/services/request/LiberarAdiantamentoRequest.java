/**
 * LiberarAdiantamentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class LiberarAdiantamentoRequest  implements java.io.Serializable {
    private java.lang.String version;

    private int idSolicitacao;

    private int idAdiantamento;

    private boolean status;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioLiberacao;

    private java.util.Date dataPagamento;

    private java.lang.String numeroAutorizacao;

    private java.lang.String observacao;

    public LiberarAdiantamentoRequest() {
    }

    public LiberarAdiantamentoRequest(
           java.lang.String version,
           int idSolicitacao,
           int idAdiantamento,
           boolean status,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioLiberacao,
           java.util.Date dataPagamento,
           java.lang.String numeroAutorizacao,
           java.lang.String observacao) {
           this.version = version;
           this.idSolicitacao = idSolicitacao;
           this.idAdiantamento = idAdiantamento;
           this.status = status;
           this.funcionarioLiberacao = funcionarioLiberacao;
           this.dataPagamento = dataPagamento;
           this.numeroAutorizacao = numeroAutorizacao;
           this.observacao = observacao;
    }


    /**
     * Gets the version value for this LiberarAdiantamentoRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this LiberarAdiantamentoRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the idSolicitacao value for this LiberarAdiantamentoRequest.
     * 
     * @return idSolicitacao
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }


    /**
     * Sets the idSolicitacao value for this LiberarAdiantamentoRequest.
     * 
     * @param idSolicitacao
     */
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }


    /**
     * Gets the idAdiantamento value for this LiberarAdiantamentoRequest.
     * 
     * @return idAdiantamento
     */
    public int getIdAdiantamento() {
        return idAdiantamento;
    }


    /**
     * Sets the idAdiantamento value for this LiberarAdiantamentoRequest.
     * 
     * @param idAdiantamento
     */
    public void setIdAdiantamento(int idAdiantamento) {
        this.idAdiantamento = idAdiantamento;
    }


    /**
     * Gets the status value for this LiberarAdiantamentoRequest.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this LiberarAdiantamentoRequest.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the funcionarioLiberacao value for this LiberarAdiantamentoRequest.
     * 
     * @return funcionarioLiberacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioLiberacao() {
        return funcionarioLiberacao;
    }


    /**
     * Sets the funcionarioLiberacao value for this LiberarAdiantamentoRequest.
     * 
     * @param funcionarioLiberacao
     */
    public void setFuncionarioLiberacao(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioLiberacao) {
        this.funcionarioLiberacao = funcionarioLiberacao;
    }


    /**
     * Gets the dataPagamento value for this LiberarAdiantamentoRequest.
     * 
     * @return dataPagamento
     */
    public java.util.Date getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this LiberarAdiantamentoRequest.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.util.Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the numeroAutorizacao value for this LiberarAdiantamentoRequest.
     * 
     * @return numeroAutorizacao
     */
    public java.lang.String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }


    /**
     * Sets the numeroAutorizacao value for this LiberarAdiantamentoRequest.
     * 
     * @param numeroAutorizacao
     */
    public void setNumeroAutorizacao(java.lang.String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }


    /**
     * Gets the observacao value for this LiberarAdiantamentoRequest.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this LiberarAdiantamentoRequest.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiberarAdiantamentoRequest)) return false;
        LiberarAdiantamentoRequest other = (LiberarAdiantamentoRequest) obj;
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
            this.idAdiantamento == other.getIdAdiantamento() &&
            this.status == other.isStatus() &&
            ((this.funcionarioLiberacao==null && other.getFuncionarioLiberacao()==null) || 
             (this.funcionarioLiberacao!=null &&
              this.funcionarioLiberacao.equals(other.getFuncionarioLiberacao()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.numeroAutorizacao==null && other.getNumeroAutorizacao()==null) || 
             (this.numeroAutorizacao!=null &&
              this.numeroAutorizacao.equals(other.getNumeroAutorizacao()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao())));
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
        _hashCode += getIdAdiantamento();
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFuncionarioLiberacao() != null) {
            _hashCode += getFuncionarioLiberacao().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getNumeroAutorizacao() != null) {
            _hashCode += getNumeroAutorizacao().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiberarAdiantamentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "liberarAdiantamentoRequest"));
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
        elemField.setFieldName("idAdiantamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAdiantamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioLiberacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioLiberacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacao"));
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
