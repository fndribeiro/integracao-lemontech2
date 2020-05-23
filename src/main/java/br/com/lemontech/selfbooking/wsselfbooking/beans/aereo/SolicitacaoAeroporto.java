/**
 * SolicitacaoAeroporto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class SolicitacaoAeroporto  implements java.io.Serializable {
    private java.lang.Integer idSolicitacaoAeroporto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCriador;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioConcluiu;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCancelou;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.BaseAtendimento baseAtendimento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.StatusSolicitacaoAeroporto statusSolicitacaoAeroporto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.TipoAtendimentoAeroporto tipoAtendimentoAeroporto;

    private java.lang.String obsConsultor;

    private java.lang.String obsAtendente;

    private java.util.Calendar dataCriacao;

    private java.util.Calendar dataFinalizacao;

    private java.util.Calendar dataCancelamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.OpcaoAtendimento opcaoAtendimento;

    public SolicitacaoAeroporto() {
    }

    public SolicitacaoAeroporto(
           java.lang.Integer idSolicitacaoAeroporto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCriador,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioConcluiu,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCancelou,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.BaseAtendimento baseAtendimento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.StatusSolicitacaoAeroporto statusSolicitacaoAeroporto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.TipoAtendimentoAeroporto tipoAtendimentoAeroporto,
           java.lang.String obsConsultor,
           java.lang.String obsAtendente,
           java.util.Calendar dataCriacao,
           java.util.Calendar dataFinalizacao,
           java.util.Calendar dataCancelamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.OpcaoAtendimento opcaoAtendimento) {
           this.idSolicitacaoAeroporto = idSolicitacaoAeroporto;
           this.usuarioCriador = usuarioCriador;
           this.usuarioConcluiu = usuarioConcluiu;
           this.usuarioCancelou = usuarioCancelou;
           this.baseAtendimento = baseAtendimento;
           this.statusSolicitacaoAeroporto = statusSolicitacaoAeroporto;
           this.tipoAtendimentoAeroporto = tipoAtendimentoAeroporto;
           this.obsConsultor = obsConsultor;
           this.obsAtendente = obsAtendente;
           this.dataCriacao = dataCriacao;
           this.dataFinalizacao = dataFinalizacao;
           this.dataCancelamento = dataCancelamento;
           this.opcaoAtendimento = opcaoAtendimento;
    }


    /**
     * Gets the idSolicitacaoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @return idSolicitacaoAeroporto
     */
    public java.lang.Integer getIdSolicitacaoAeroporto() {
        return idSolicitacaoAeroporto;
    }


    /**
     * Sets the idSolicitacaoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @param idSolicitacaoAeroporto
     */
    public void setIdSolicitacaoAeroporto(java.lang.Integer idSolicitacaoAeroporto) {
        this.idSolicitacaoAeroporto = idSolicitacaoAeroporto;
    }


    /**
     * Gets the usuarioCriador value for this SolicitacaoAeroporto.
     * 
     * @return usuarioCriador
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getUsuarioCriador() {
        return usuarioCriador;
    }


    /**
     * Sets the usuarioCriador value for this SolicitacaoAeroporto.
     * 
     * @param usuarioCriador
     */
    public void setUsuarioCriador(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }


    /**
     * Gets the usuarioConcluiu value for this SolicitacaoAeroporto.
     * 
     * @return usuarioConcluiu
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getUsuarioConcluiu() {
        return usuarioConcluiu;
    }


    /**
     * Sets the usuarioConcluiu value for this SolicitacaoAeroporto.
     * 
     * @param usuarioConcluiu
     */
    public void setUsuarioConcluiu(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioConcluiu) {
        this.usuarioConcluiu = usuarioConcluiu;
    }


    /**
     * Gets the usuarioCancelou value for this SolicitacaoAeroporto.
     * 
     * @return usuarioCancelou
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getUsuarioCancelou() {
        return usuarioCancelou;
    }


    /**
     * Sets the usuarioCancelou value for this SolicitacaoAeroporto.
     * 
     * @param usuarioCancelou
     */
    public void setUsuarioCancelou(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro usuarioCancelou) {
        this.usuarioCancelou = usuarioCancelou;
    }


    /**
     * Gets the baseAtendimento value for this SolicitacaoAeroporto.
     * 
     * @return baseAtendimento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.BaseAtendimento getBaseAtendimento() {
        return baseAtendimento;
    }


    /**
     * Sets the baseAtendimento value for this SolicitacaoAeroporto.
     * 
     * @param baseAtendimento
     */
    public void setBaseAtendimento(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.BaseAtendimento baseAtendimento) {
        this.baseAtendimento = baseAtendimento;
    }


    /**
     * Gets the statusSolicitacaoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @return statusSolicitacaoAeroporto
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.StatusSolicitacaoAeroporto getStatusSolicitacaoAeroporto() {
        return statusSolicitacaoAeroporto;
    }


    /**
     * Sets the statusSolicitacaoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @param statusSolicitacaoAeroporto
     */
    public void setStatusSolicitacaoAeroporto(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.StatusSolicitacaoAeroporto statusSolicitacaoAeroporto) {
        this.statusSolicitacaoAeroporto = statusSolicitacaoAeroporto;
    }


    /**
     * Gets the tipoAtendimentoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @return tipoAtendimentoAeroporto
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.TipoAtendimentoAeroporto getTipoAtendimentoAeroporto() {
        return tipoAtendimentoAeroporto;
    }


    /**
     * Sets the tipoAtendimentoAeroporto value for this SolicitacaoAeroporto.
     * 
     * @param tipoAtendimentoAeroporto
     */
    public void setTipoAtendimentoAeroporto(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.TipoAtendimentoAeroporto tipoAtendimentoAeroporto) {
        this.tipoAtendimentoAeroporto = tipoAtendimentoAeroporto;
    }


    /**
     * Gets the obsConsultor value for this SolicitacaoAeroporto.
     * 
     * @return obsConsultor
     */
    public java.lang.String getObsConsultor() {
        return obsConsultor;
    }


    /**
     * Sets the obsConsultor value for this SolicitacaoAeroporto.
     * 
     * @param obsConsultor
     */
    public void setObsConsultor(java.lang.String obsConsultor) {
        this.obsConsultor = obsConsultor;
    }


    /**
     * Gets the obsAtendente value for this SolicitacaoAeroporto.
     * 
     * @return obsAtendente
     */
    public java.lang.String getObsAtendente() {
        return obsAtendente;
    }


    /**
     * Sets the obsAtendente value for this SolicitacaoAeroporto.
     * 
     * @param obsAtendente
     */
    public void setObsAtendente(java.lang.String obsAtendente) {
        this.obsAtendente = obsAtendente;
    }


    /**
     * Gets the dataCriacao value for this SolicitacaoAeroporto.
     * 
     * @return dataCriacao
     */
    public java.util.Calendar getDataCriacao() {
        return dataCriacao;
    }


    /**
     * Sets the dataCriacao value for this SolicitacaoAeroporto.
     * 
     * @param dataCriacao
     */
    public void setDataCriacao(java.util.Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    /**
     * Gets the dataFinalizacao value for this SolicitacaoAeroporto.
     * 
     * @return dataFinalizacao
     */
    public java.util.Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }


    /**
     * Sets the dataFinalizacao value for this SolicitacaoAeroporto.
     * 
     * @param dataFinalizacao
     */
    public void setDataFinalizacao(java.util.Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }


    /**
     * Gets the dataCancelamento value for this SolicitacaoAeroporto.
     * 
     * @return dataCancelamento
     */
    public java.util.Calendar getDataCancelamento() {
        return dataCancelamento;
    }


    /**
     * Sets the dataCancelamento value for this SolicitacaoAeroporto.
     * 
     * @param dataCancelamento
     */
    public void setDataCancelamento(java.util.Calendar dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }


    /**
     * Gets the opcaoAtendimento value for this SolicitacaoAeroporto.
     * 
     * @return opcaoAtendimento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.OpcaoAtendimento getOpcaoAtendimento() {
        return opcaoAtendimento;
    }


    /**
     * Sets the opcaoAtendimento value for this SolicitacaoAeroporto.
     * 
     * @param opcaoAtendimento
     */
    public void setOpcaoAtendimento(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.OpcaoAtendimento opcaoAtendimento) {
        this.opcaoAtendimento = opcaoAtendimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitacaoAeroporto)) return false;
        SolicitacaoAeroporto other = (SolicitacaoAeroporto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSolicitacaoAeroporto==null && other.getIdSolicitacaoAeroporto()==null) || 
             (this.idSolicitacaoAeroporto!=null &&
              this.idSolicitacaoAeroporto.equals(other.getIdSolicitacaoAeroporto()))) &&
            ((this.usuarioCriador==null && other.getUsuarioCriador()==null) || 
             (this.usuarioCriador!=null &&
              this.usuarioCriador.equals(other.getUsuarioCriador()))) &&
            ((this.usuarioConcluiu==null && other.getUsuarioConcluiu()==null) || 
             (this.usuarioConcluiu!=null &&
              this.usuarioConcluiu.equals(other.getUsuarioConcluiu()))) &&
            ((this.usuarioCancelou==null && other.getUsuarioCancelou()==null) || 
             (this.usuarioCancelou!=null &&
              this.usuarioCancelou.equals(other.getUsuarioCancelou()))) &&
            ((this.baseAtendimento==null && other.getBaseAtendimento()==null) || 
             (this.baseAtendimento!=null &&
              this.baseAtendimento.equals(other.getBaseAtendimento()))) &&
            ((this.statusSolicitacaoAeroporto==null && other.getStatusSolicitacaoAeroporto()==null) || 
             (this.statusSolicitacaoAeroporto!=null &&
              this.statusSolicitacaoAeroporto.equals(other.getStatusSolicitacaoAeroporto()))) &&
            ((this.tipoAtendimentoAeroporto==null && other.getTipoAtendimentoAeroporto()==null) || 
             (this.tipoAtendimentoAeroporto!=null &&
              this.tipoAtendimentoAeroporto.equals(other.getTipoAtendimentoAeroporto()))) &&
            ((this.obsConsultor==null && other.getObsConsultor()==null) || 
             (this.obsConsultor!=null &&
              this.obsConsultor.equals(other.getObsConsultor()))) &&
            ((this.obsAtendente==null && other.getObsAtendente()==null) || 
             (this.obsAtendente!=null &&
              this.obsAtendente.equals(other.getObsAtendente()))) &&
            ((this.dataCriacao==null && other.getDataCriacao()==null) || 
             (this.dataCriacao!=null &&
              this.dataCriacao.equals(other.getDataCriacao()))) &&
            ((this.dataFinalizacao==null && other.getDataFinalizacao()==null) || 
             (this.dataFinalizacao!=null &&
              this.dataFinalizacao.equals(other.getDataFinalizacao()))) &&
            ((this.dataCancelamento==null && other.getDataCancelamento()==null) || 
             (this.dataCancelamento!=null &&
              this.dataCancelamento.equals(other.getDataCancelamento()))) &&
            ((this.opcaoAtendimento==null && other.getOpcaoAtendimento()==null) || 
             (this.opcaoAtendimento!=null &&
              this.opcaoAtendimento.equals(other.getOpcaoAtendimento())));
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
        if (getIdSolicitacaoAeroporto() != null) {
            _hashCode += getIdSolicitacaoAeroporto().hashCode();
        }
        if (getUsuarioCriador() != null) {
            _hashCode += getUsuarioCriador().hashCode();
        }
        if (getUsuarioConcluiu() != null) {
            _hashCode += getUsuarioConcluiu().hashCode();
        }
        if (getUsuarioCancelou() != null) {
            _hashCode += getUsuarioCancelou().hashCode();
        }
        if (getBaseAtendimento() != null) {
            _hashCode += getBaseAtendimento().hashCode();
        }
        if (getStatusSolicitacaoAeroporto() != null) {
            _hashCode += getStatusSolicitacaoAeroporto().hashCode();
        }
        if (getTipoAtendimentoAeroporto() != null) {
            _hashCode += getTipoAtendimentoAeroporto().hashCode();
        }
        if (getObsConsultor() != null) {
            _hashCode += getObsConsultor().hashCode();
        }
        if (getObsAtendente() != null) {
            _hashCode += getObsAtendente().hashCode();
        }
        if (getDataCriacao() != null) {
            _hashCode += getDataCriacao().hashCode();
        }
        if (getDataFinalizacao() != null) {
            _hashCode += getDataFinalizacao().hashCode();
        }
        if (getDataCancelamento() != null) {
            _hashCode += getDataCancelamento().hashCode();
        }
        if (getOpcaoAtendimento() != null) {
            _hashCode += getOpcaoAtendimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitacaoAeroporto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "solicitacaoAeroporto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoAeroporto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoAeroporto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioCriador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioCriador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioConcluiu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioConcluiu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioCancelou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioCancelou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "baseAtendimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusSolicitacaoAeroporto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusSolicitacaoAeroporto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "statusSolicitacaoAeroporto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAtendimentoAeroporto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoAtendimentoAeroporto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "tipoAtendimentoAeroporto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsConsultor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obsConsultor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsAtendente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obsAtendente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCriacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCriacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinalizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinalizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcaoAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcaoAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "opcaoAtendimento"));
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
