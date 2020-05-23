/**
 * ContaBancariaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class ContaBancariaRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.InstituicaoBancariaRef instituicaoBancariaRef;

    private java.lang.String agencia;

    private java.lang.String conta;

    private java.lang.Boolean padrao;

    private boolean status;

    public ContaBancariaRequest() {
    }

    public ContaBancariaRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.InstituicaoBancariaRef instituicaoBancariaRef,
           java.lang.String agencia,
           java.lang.String conta,
           java.lang.Boolean padrao,
           boolean status) {
           this.funcionarioRef = funcionarioRef;
           this.instituicaoBancariaRef = instituicaoBancariaRef;
           this.agencia = agencia;
           this.conta = conta;
           this.padrao = padrao;
           this.status = status;
    }


    /**
     * Gets the funcionarioRef value for this ContaBancariaRequest.
     * 
     * @return funcionarioRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this ContaBancariaRequest.
     * 
     * @param funcionarioRef
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the instituicaoBancariaRef value for this ContaBancariaRequest.
     * 
     * @return instituicaoBancariaRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.InstituicaoBancariaRef getInstituicaoBancariaRef() {
        return instituicaoBancariaRef;
    }


    /**
     * Sets the instituicaoBancariaRef value for this ContaBancariaRequest.
     * 
     * @param instituicaoBancariaRef
     */
    public void setInstituicaoBancariaRef(br.com.lemontech.selfbooking.wsselfbooking.beans.InstituicaoBancariaRef instituicaoBancariaRef) {
        this.instituicaoBancariaRef = instituicaoBancariaRef;
    }


    /**
     * Gets the agencia value for this ContaBancariaRequest.
     * 
     * @return agencia
     */
    public java.lang.String getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this ContaBancariaRequest.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.String agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the conta value for this ContaBancariaRequest.
     * 
     * @return conta
     */
    public java.lang.String getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this ContaBancariaRequest.
     * 
     * @param conta
     */
    public void setConta(java.lang.String conta) {
        this.conta = conta;
    }


    /**
     * Gets the padrao value for this ContaBancariaRequest.
     * 
     * @return padrao
     */
    public java.lang.Boolean getPadrao() {
        return padrao;
    }


    /**
     * Sets the padrao value for this ContaBancariaRequest.
     * 
     * @param padrao
     */
    public void setPadrao(java.lang.Boolean padrao) {
        this.padrao = padrao;
    }


    /**
     * Gets the status value for this ContaBancariaRequest.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContaBancariaRequest.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContaBancariaRequest)) return false;
        ContaBancariaRequest other = (ContaBancariaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionarioRef==null && other.getFuncionarioRef()==null) || 
             (this.funcionarioRef!=null &&
              this.funcionarioRef.equals(other.getFuncionarioRef()))) &&
            ((this.instituicaoBancariaRef==null && other.getInstituicaoBancariaRef()==null) || 
             (this.instituicaoBancariaRef!=null &&
              this.instituicaoBancariaRef.equals(other.getInstituicaoBancariaRef()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.conta==null && other.getConta()==null) || 
             (this.conta!=null &&
              this.conta.equals(other.getConta()))) &&
            ((this.padrao==null && other.getPadrao()==null) || 
             (this.padrao!=null &&
              this.padrao.equals(other.getPadrao()))) &&
            this.status == other.isStatus();
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
        if (getFuncionarioRef() != null) {
            _hashCode += getFuncionarioRef().hashCode();
        }
        if (getInstituicaoBancariaRef() != null) {
            _hashCode += getInstituicaoBancariaRef().hashCode();
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getConta() != null) {
            _hashCode += getConta().hashCode();
        }
        if (getPadrao() != null) {
            _hashCode += getPadrao().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContaBancariaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "contaBancariaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instituicaoBancariaRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instituicaoBancariaRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "instituicaoBancariaRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padrao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "padrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
