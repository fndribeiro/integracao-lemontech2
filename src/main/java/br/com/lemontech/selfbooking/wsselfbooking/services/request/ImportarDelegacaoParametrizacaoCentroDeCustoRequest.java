/**
 * ImportarDelegacaoParametrizacaoCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class ImportarDelegacaoParametrizacaoCentroDeCustoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefOrigem;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefDestino;

    private java.util.Date vencimentoDelegacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.DelegarTodasParametrizacoes delegarTodasParametrizacoes;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacoesEspecificas parametrizacoesEspecificas;

    public ImportarDelegacaoParametrizacaoCentroDeCustoRequest() {
    }

    public ImportarDelegacaoParametrizacaoCentroDeCustoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefOrigem,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefDestino,
           java.util.Date vencimentoDelegacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.DelegarTodasParametrizacoes delegarTodasParametrizacoes,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacoesEspecificas parametrizacoesEspecificas) {
           this.funcionarioRefOrigem = funcionarioRefOrigem;
           this.funcionarioRefDestino = funcionarioRefDestino;
           this.vencimentoDelegacao = vencimentoDelegacao;
           this.delegarTodasParametrizacoes = delegarTodasParametrizacoes;
           this.parametrizacoesEspecificas = parametrizacoesEspecificas;
    }


    /**
     * Gets the funcionarioRefOrigem value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @return funcionarioRefOrigem
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRefOrigem() {
        return funcionarioRefOrigem;
    }


    /**
     * Sets the funcionarioRefOrigem value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @param funcionarioRefOrigem
     */
    public void setFuncionarioRefOrigem(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefOrigem) {
        this.funcionarioRefOrigem = funcionarioRefOrigem;
    }


    /**
     * Gets the funcionarioRefDestino value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @return funcionarioRefDestino
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRefDestino() {
        return funcionarioRefDestino;
    }


    /**
     * Sets the funcionarioRefDestino value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @param funcionarioRefDestino
     */
    public void setFuncionarioRefDestino(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRefDestino) {
        this.funcionarioRefDestino = funcionarioRefDestino;
    }


    /**
     * Gets the vencimentoDelegacao value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @return vencimentoDelegacao
     */
    public java.util.Date getVencimentoDelegacao() {
        return vencimentoDelegacao;
    }


    /**
     * Sets the vencimentoDelegacao value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @param vencimentoDelegacao
     */
    public void setVencimentoDelegacao(java.util.Date vencimentoDelegacao) {
        this.vencimentoDelegacao = vencimentoDelegacao;
    }


    /**
     * Gets the delegarTodasParametrizacoes value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @return delegarTodasParametrizacoes
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.DelegarTodasParametrizacoes getDelegarTodasParametrizacoes() {
        return delegarTodasParametrizacoes;
    }


    /**
     * Sets the delegarTodasParametrizacoes value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @param delegarTodasParametrizacoes
     */
    public void setDelegarTodasParametrizacoes(br.com.lemontech.selfbooking.wsselfbooking.beans.DelegarTodasParametrizacoes delegarTodasParametrizacoes) {
        this.delegarTodasParametrizacoes = delegarTodasParametrizacoes;
    }


    /**
     * Gets the parametrizacoesEspecificas value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacoesEspecificas
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacoesEspecificas getParametrizacoesEspecificas() {
        return parametrizacoesEspecificas;
    }


    /**
     * Sets the parametrizacoesEspecificas value for this ImportarDelegacaoParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacoesEspecificas
     */
    public void setParametrizacoesEspecificas(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacoesEspecificas parametrizacoesEspecificas) {
        this.parametrizacoesEspecificas = parametrizacoesEspecificas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportarDelegacaoParametrizacaoCentroDeCustoRequest)) return false;
        ImportarDelegacaoParametrizacaoCentroDeCustoRequest other = (ImportarDelegacaoParametrizacaoCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionarioRefOrigem==null && other.getFuncionarioRefOrigem()==null) || 
             (this.funcionarioRefOrigem!=null &&
              this.funcionarioRefOrigem.equals(other.getFuncionarioRefOrigem()))) &&
            ((this.funcionarioRefDestino==null && other.getFuncionarioRefDestino()==null) || 
             (this.funcionarioRefDestino!=null &&
              this.funcionarioRefDestino.equals(other.getFuncionarioRefDestino()))) &&
            ((this.vencimentoDelegacao==null && other.getVencimentoDelegacao()==null) || 
             (this.vencimentoDelegacao!=null &&
              this.vencimentoDelegacao.equals(other.getVencimentoDelegacao()))) &&
            ((this.delegarTodasParametrizacoes==null && other.getDelegarTodasParametrizacoes()==null) || 
             (this.delegarTodasParametrizacoes!=null &&
              this.delegarTodasParametrizacoes.equals(other.getDelegarTodasParametrizacoes()))) &&
            ((this.parametrizacoesEspecificas==null && other.getParametrizacoesEspecificas()==null) || 
             (this.parametrizacoesEspecificas!=null &&
              this.parametrizacoesEspecificas.equals(other.getParametrizacoesEspecificas())));
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
        if (getFuncionarioRefOrigem() != null) {
            _hashCode += getFuncionarioRefOrigem().hashCode();
        }
        if (getFuncionarioRefDestino() != null) {
            _hashCode += getFuncionarioRefDestino().hashCode();
        }
        if (getVencimentoDelegacao() != null) {
            _hashCode += getVencimentoDelegacao().hashCode();
        }
        if (getDelegarTodasParametrizacoes() != null) {
            _hashCode += getDelegarTodasParametrizacoes().hashCode();
        }
        if (getParametrizacoesEspecificas() != null) {
            _hashCode += getParametrizacoesEspecificas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportarDelegacaoParametrizacaoCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "importarDelegacaoParametrizacaoCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRefOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRefOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRefDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRefDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimentoDelegacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimentoDelegacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegarTodasParametrizacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delegarTodasParametrizacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "delegarTodasParametrizacoes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacoesEspecificas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacoesEspecificas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacoesEspecificas"));
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
