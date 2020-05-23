/**
 * PesquisarSolicitacaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class PesquisarSolicitacaoRequest  implements java.io.Serializable {
    private java.lang.String version;

    private int idSolicitacaoRef;

    private java.lang.Boolean exibirCancelados;

    private java.lang.Boolean exibirPendentesAprovacao;

    private java.util.Calendar dataInicial;

    private java.util.Calendar dataFinal;

    private java.lang.Integer quantidadeRegistros;

    private java.lang.Boolean sincronizado;

    private java.lang.Boolean exibirRemarks;

    private java.lang.Boolean exibirAprovadas;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao;

    private java.util.Calendar dataAlteracaoInicial;

    private java.util.Calendar dataAlteracaoFinal;

    public PesquisarSolicitacaoRequest() {
    }

    public PesquisarSolicitacaoRequest(
           java.lang.String version,
           int idSolicitacaoRef,
           java.lang.Boolean exibirCancelados,
           java.lang.Boolean exibirPendentesAprovacao,
           java.util.Calendar dataInicial,
           java.util.Calendar dataFinal,
           int registroInicial,
           java.lang.Integer quantidadeRegistros,
           java.lang.Boolean sincronizado,
           java.lang.Boolean exibirCancelados2,
           java.lang.Boolean exibirRemarks,
           java.lang.Boolean exibirAprovadas,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao,
           java.util.Calendar dataAlteracaoInicial,
           java.util.Calendar dataAlteracaoFinal) {
           this.version = version;
           this.idSolicitacaoRef = idSolicitacaoRef;
           this.exibirCancelados = exibirCancelados;
           this.exibirPendentesAprovacao = exibirPendentesAprovacao;
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.quantidadeRegistros = quantidadeRegistros;
           this.sincronizado = sincronizado;
           this.exibirRemarks = exibirRemarks;
           this.exibirAprovadas = exibirAprovadas;
           this.tipoSolicitacao = tipoSolicitacao;
           this.dataAlteracaoInicial = dataAlteracaoInicial;
           this.dataAlteracaoFinal = dataAlteracaoFinal;
    }


    /**
     * Gets the version value for this PesquisarSolicitacaoRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PesquisarSolicitacaoRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the idSolicitacaoRef value for this PesquisarSolicitacaoRequest.
     * 
     * @return idSolicitacaoRef
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }


    /**
     * Sets the idSolicitacaoRef value for this PesquisarSolicitacaoRequest.
     * 
     * @param idSolicitacaoRef
     */
    public void setIdSolicitacaoRef(int idSolicitacaoRef) {
        this.idSolicitacaoRef = idSolicitacaoRef;
    }


    /**
     * Gets the exibirCancelados value for this PesquisarSolicitacaoRequest.
     * 
     * @return exibirCancelados
     */
    public java.lang.Boolean getExibirCancelados() {
        return exibirCancelados;
    }


    /**
     * Sets the exibirCancelados value for this PesquisarSolicitacaoRequest.
     * 
     * @param exibirCancelados
     */
    public void setExibirCancelados(java.lang.Boolean exibirCancelados) {
        this.exibirCancelados = exibirCancelados;
    }


    /**
     * Gets the exibirPendentesAprovacao value for this PesquisarSolicitacaoRequest.
     * 
     * @return exibirPendentesAprovacao
     */
    public java.lang.Boolean getExibirPendentesAprovacao() {
        return exibirPendentesAprovacao;
    }


    /**
     * Sets the exibirPendentesAprovacao value for this PesquisarSolicitacaoRequest.
     * 
     * @param exibirPendentesAprovacao
     */
    public void setExibirPendentesAprovacao(java.lang.Boolean exibirPendentesAprovacao) {
        this.exibirPendentesAprovacao = exibirPendentesAprovacao;
    }


    /**
     * Gets the dataInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @return dataInicial
     */
    public java.util.Calendar getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.util.Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this PesquisarSolicitacaoRequest.
     * 
     * @return dataFinal
     */
    public java.util.Calendar getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this PesquisarSolicitacaoRequest.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.util.Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the registroInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @return registroInicial
     */
    
    /**
     * Sets the registroInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @param registroInicial
     */


    /**
     * Gets the quantidadeRegistros value for this PesquisarSolicitacaoRequest.
     * 
     * @return quantidadeRegistros
     */
    public java.lang.Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }


    /**
     * Sets the quantidadeRegistros value for this PesquisarSolicitacaoRequest.
     * 
     * @param quantidadeRegistros
     */
    public void setQuantidadeRegistros(java.lang.Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }


    /**
     * Gets the sincronizado value for this PesquisarSolicitacaoRequest.
     * 
     * @return sincronizado
     */
    public java.lang.Boolean getSincronizado() {
        return sincronizado;
    }


    /**
     * Sets the sincronizado value for this PesquisarSolicitacaoRequest.
     * 
     * @param sincronizado
     */
    public void setSincronizado(java.lang.Boolean sincronizado) {
        this.sincronizado = sincronizado;
    }


    /**
     * Gets the exibirCancelados2 value for this PesquisarSolicitacaoRequest.
     * 
     * @return exibirCancelados2
     */
    
    /**
     * Sets the exibirCancelados2 value for this PesquisarSolicitacaoRequest.
     * 
     * @param exibirCancelados2
     */
    
    /**
     * Gets the exibirRemarks value for this PesquisarSolicitacaoRequest.
     * 
     * @return exibirRemarks
     */
    public java.lang.Boolean getExibirRemarks() {
        return exibirRemarks;
    }


    /**
     * Sets the exibirRemarks value for this PesquisarSolicitacaoRequest.
     * 
     * @param exibirRemarks
     */
    public void setExibirRemarks(java.lang.Boolean exibirRemarks) {
        this.exibirRemarks = exibirRemarks;
    }


    /**
     * Gets the exibirAprovadas value for this PesquisarSolicitacaoRequest.
     * 
     * @return exibirAprovadas
     */
    public java.lang.Boolean getExibirAprovadas() {
        return exibirAprovadas;
    }


    /**
     * Sets the exibirAprovadas value for this PesquisarSolicitacaoRequest.
     * 
     * @param exibirAprovadas
     */
    public void setExibirAprovadas(java.lang.Boolean exibirAprovadas) {
        this.exibirAprovadas = exibirAprovadas;
    }


    /**
     * Gets the tipoSolicitacao value for this PesquisarSolicitacaoRequest.
     * 
     * @return tipoSolicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }


    /**
     * Sets the tipoSolicitacao value for this PesquisarSolicitacaoRequest.
     * 
     * @param tipoSolicitacao
     */
    public void setTipoSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }


    /**
     * Gets the dataAlteracaoInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @return dataAlteracaoInicial
     */
    public java.util.Calendar getDataAlteracaoInicial() {
        return dataAlteracaoInicial;
    }


    /**
     * Sets the dataAlteracaoInicial value for this PesquisarSolicitacaoRequest.
     * 
     * @param dataAlteracaoInicial
     */
    public void setDataAlteracaoInicial(java.util.Calendar dataAlteracaoInicial) {
        this.dataAlteracaoInicial = dataAlteracaoInicial;
    }


    /**
     * Gets the dataAlteracaoFinal value for this PesquisarSolicitacaoRequest.
     * 
     * @return dataAlteracaoFinal
     */
    public java.util.Calendar getDataAlteracaoFinal() {
        return dataAlteracaoFinal;
    }


    /**
     * Sets the dataAlteracaoFinal value for this PesquisarSolicitacaoRequest.
     * 
     * @param dataAlteracaoFinal
     */
    public void setDataAlteracaoFinal(java.util.Calendar dataAlteracaoFinal) {
        this.dataAlteracaoFinal = dataAlteracaoFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarSolicitacaoRequest)) return false;
        PesquisarSolicitacaoRequest other = (PesquisarSolicitacaoRequest) obj;
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
            this.idSolicitacaoRef == other.getIdSolicitacaoRef() &&
            ((this.exibirCancelados==null && other.getExibirCancelados()==null) || 
             (this.exibirCancelados!=null &&
              this.exibirCancelados.equals(other.getExibirCancelados()))) &&
            ((this.exibirPendentesAprovacao==null && other.getExibirPendentesAprovacao()==null) || 
             (this.exibirPendentesAprovacao!=null &&
              this.exibirPendentesAprovacao.equals(other.getExibirPendentesAprovacao()))) &&
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            ((this.quantidadeRegistros==null && other.getQuantidadeRegistros()==null) || 
             (this.quantidadeRegistros!=null &&
              this.quantidadeRegistros.equals(other.getQuantidadeRegistros()))) &&
            ((this.sincronizado==null && other.getSincronizado()==null) || 
             (this.sincronizado!=null &&
              this.sincronizado.equals(other.getSincronizado()))) &&
            ((this.exibirRemarks==null && other.getExibirRemarks()==null) || 
             (this.exibirRemarks!=null &&
              this.exibirRemarks.equals(other.getExibirRemarks()))) &&
            ((this.exibirAprovadas==null && other.getExibirAprovadas()==null) || 
             (this.exibirAprovadas!=null &&
              this.exibirAprovadas.equals(other.getExibirAprovadas()))) &&
            ((this.tipoSolicitacao==null && other.getTipoSolicitacao()==null) || 
             (this.tipoSolicitacao!=null &&
              this.tipoSolicitacao.equals(other.getTipoSolicitacao()))) &&
            ((this.dataAlteracaoInicial==null && other.getDataAlteracaoInicial()==null) || 
             (this.dataAlteracaoInicial!=null &&
              this.dataAlteracaoInicial.equals(other.getDataAlteracaoInicial()))) &&
            ((this.dataAlteracaoFinal==null && other.getDataAlteracaoFinal()==null) || 
             (this.dataAlteracaoFinal!=null &&
              this.dataAlteracaoFinal.equals(other.getDataAlteracaoFinal())));
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
        _hashCode += getIdSolicitacaoRef();
        if (getExibirCancelados() != null) {
            _hashCode += getExibirCancelados().hashCode();
        }
        if (getExibirPendentesAprovacao() != null) {
            _hashCode += getExibirPendentesAprovacao().hashCode();
        }
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        
        if (getQuantidadeRegistros() != null) {
            _hashCode += getQuantidadeRegistros().hashCode();
        }
        if (getSincronizado() != null) {
            _hashCode += getSincronizado().hashCode();
        }
        if (getExibirRemarks() != null) {
            _hashCode += getExibirRemarks().hashCode();
        }
        if (getExibirAprovadas() != null) {
            _hashCode += getExibirAprovadas().hashCode();
        }
        if (getTipoSolicitacao() != null) {
            _hashCode += getTipoSolicitacao().hashCode();
        }
        if (getDataAlteracaoInicial() != null) {
            _hashCode += getDataAlteracaoInicial().hashCode();
        }
        if (getDataAlteracaoFinal() != null) {
            _hashCode += getDataAlteracaoFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarSolicitacaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarSolicitacaoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exibirCancelados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exibirCancelados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exibirPendentesAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exibirPendentesAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("sincronizado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sincronizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exibirCancelados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exibirCancelados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exibirRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exibirRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exibirAprovadas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exibirAprovadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoSolicitacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAlteracaoInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAlteracaoInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAlteracaoFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAlteracaoFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
