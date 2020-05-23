/**
 * BaseAtendimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class BaseAtendimento  implements java.io.Serializable {
    private java.lang.Integer idBaseAtendimento;

    private java.lang.Boolean atendimentoTerceiro;

    private java.lang.String email;

    private java.lang.String informacoes;

    private java.lang.Boolean ativo;

    private java.util.Calendar dataCadastro;

    public BaseAtendimento() {
    }

    public BaseAtendimento(
           java.lang.Integer idBaseAtendimento,
           java.lang.Boolean atendimentoTerceiro,
           java.lang.String email,
           java.lang.String informacoes,
           java.lang.Boolean ativo,
           java.util.Calendar dataCadastro) {
           this.idBaseAtendimento = idBaseAtendimento;
           this.atendimentoTerceiro = atendimentoTerceiro;
           this.email = email;
           this.informacoes = informacoes;
           this.ativo = ativo;
           this.dataCadastro = dataCadastro;
    }


    /**
     * Gets the idBaseAtendimento value for this BaseAtendimento.
     * 
     * @return idBaseAtendimento
     */
    public java.lang.Integer getIdBaseAtendimento() {
        return idBaseAtendimento;
    }


    /**
     * Sets the idBaseAtendimento value for this BaseAtendimento.
     * 
     * @param idBaseAtendimento
     */
    public void setIdBaseAtendimento(java.lang.Integer idBaseAtendimento) {
        this.idBaseAtendimento = idBaseAtendimento;
    }


    /**
     * Gets the atendimentoTerceiro value for this BaseAtendimento.
     * 
     * @return atendimentoTerceiro
     */
    public java.lang.Boolean getAtendimentoTerceiro() {
        return atendimentoTerceiro;
    }


    /**
     * Sets the atendimentoTerceiro value for this BaseAtendimento.
     * 
     * @param atendimentoTerceiro
     */
    public void setAtendimentoTerceiro(java.lang.Boolean atendimentoTerceiro) {
        this.atendimentoTerceiro = atendimentoTerceiro;
    }


    /**
     * Gets the email value for this BaseAtendimento.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this BaseAtendimento.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the informacoes value for this BaseAtendimento.
     * 
     * @return informacoes
     */
    public java.lang.String getInformacoes() {
        return informacoes;
    }


    /**
     * Sets the informacoes value for this BaseAtendimento.
     * 
     * @param informacoes
     */
    public void setInformacoes(java.lang.String informacoes) {
        this.informacoes = informacoes;
    }


    /**
     * Gets the ativo value for this BaseAtendimento.
     * 
     * @return ativo
     */
    public java.lang.Boolean getAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this BaseAtendimento.
     * 
     * @param ativo
     */
    public void setAtivo(java.lang.Boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the dataCadastro value for this BaseAtendimento.
     * 
     * @return dataCadastro
     */
    public java.util.Calendar getDataCadastro() {
        return dataCadastro;
    }


    /**
     * Sets the dataCadastro value for this BaseAtendimento.
     * 
     * @param dataCadastro
     */
    public void setDataCadastro(java.util.Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseAtendimento)) return false;
        BaseAtendimento other = (BaseAtendimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idBaseAtendimento==null && other.getIdBaseAtendimento()==null) || 
             (this.idBaseAtendimento!=null &&
              this.idBaseAtendimento.equals(other.getIdBaseAtendimento()))) &&
            ((this.atendimentoTerceiro==null && other.getAtendimentoTerceiro()==null) || 
             (this.atendimentoTerceiro!=null &&
              this.atendimentoTerceiro.equals(other.getAtendimentoTerceiro()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.informacoes==null && other.getInformacoes()==null) || 
             (this.informacoes!=null &&
              this.informacoes.equals(other.getInformacoes()))) &&
            ((this.ativo==null && other.getAtivo()==null) || 
             (this.ativo!=null &&
              this.ativo.equals(other.getAtivo()))) &&
            ((this.dataCadastro==null && other.getDataCadastro()==null) || 
             (this.dataCadastro!=null &&
              this.dataCadastro.equals(other.getDataCadastro())));
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
        if (getIdBaseAtendimento() != null) {
            _hashCode += getIdBaseAtendimento().hashCode();
        }
        if (getAtendimentoTerceiro() != null) {
            _hashCode += getAtendimentoTerceiro().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getInformacoes() != null) {
            _hashCode += getInformacoes().hashCode();
        }
        if (getAtivo() != null) {
            _hashCode += getAtivo().hashCode();
        }
        if (getDataCadastro() != null) {
            _hashCode += getDataCadastro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseAtendimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "baseAtendimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBaseAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idBaseAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atendimentoTerceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atendimentoTerceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCadastro"));
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
