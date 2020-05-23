/**
 * AdiantamentoItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class AdiantamentoItem  implements java.io.Serializable {
    private java.lang.String tipoDespesa;

    private java.lang.Double valor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private java.lang.String codigoDespesa;

    private java.lang.String classificacao;

    private int id;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio;

    private java.lang.Double valorMoedaCambio;

    private java.lang.Double totalConvertido;

    public AdiantamentoItem() {
    }

    public AdiantamentoItem(
           java.lang.String tipoDespesa,
           java.lang.Double valor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           java.lang.String codigoDespesa,
           java.lang.String classificacao,
           int id,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio,
           java.lang.Double valorMoedaCambio,
           java.lang.Double totalConvertido) {
           this.tipoDespesa = tipoDespesa;
           this.valor = valor;
           this.moeda = moeda;
           this.codigoDespesa = codigoDespesa;
           this.classificacao = classificacao;
           this.id = id;
           this.moedaCambio = moedaCambio;
           this.valorMoedaCambio = valorMoedaCambio;
           this.totalConvertido = totalConvertido;
    }


    /**
     * Gets the tipoDespesa value for this AdiantamentoItem.
     * 
     * @return tipoDespesa
     */
    public java.lang.String getTipoDespesa() {
        return tipoDespesa;
    }


    /**
     * Sets the tipoDespesa value for this AdiantamentoItem.
     * 
     * @param tipoDespesa
     */
    public void setTipoDespesa(java.lang.String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    /**
     * Gets the valor value for this AdiantamentoItem.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this AdiantamentoItem.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the moeda value for this AdiantamentoItem.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this AdiantamentoItem.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the codigoDespesa value for this AdiantamentoItem.
     * 
     * @return codigoDespesa
     */
    public java.lang.String getCodigoDespesa() {
        return codigoDespesa;
    }


    /**
     * Sets the codigoDespesa value for this AdiantamentoItem.
     * 
     * @param codigoDespesa
     */
    public void setCodigoDespesa(java.lang.String codigoDespesa) {
        this.codigoDespesa = codigoDespesa;
    }


    /**
     * Gets the classificacao value for this AdiantamentoItem.
     * 
     * @return classificacao
     */
    public java.lang.String getClassificacao() {
        return classificacao;
    }


    /**
     * Sets the classificacao value for this AdiantamentoItem.
     * 
     * @param classificacao
     */
    public void setClassificacao(java.lang.String classificacao) {
        this.classificacao = classificacao;
    }


    /**
     * Gets the id value for this AdiantamentoItem.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this AdiantamentoItem.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the moedaCambio value for this AdiantamentoItem.
     * 
     * @return moedaCambio
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoedaCambio() {
        return moedaCambio;
    }


    /**
     * Sets the moedaCambio value for this AdiantamentoItem.
     * 
     * @param moedaCambio
     */
    public void setMoedaCambio(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio) {
        this.moedaCambio = moedaCambio;
    }


    /**
     * Gets the valorMoedaCambio value for this AdiantamentoItem.
     * 
     * @return valorMoedaCambio
     */
    public java.lang.Double getValorMoedaCambio() {
        return valorMoedaCambio;
    }


    /**
     * Sets the valorMoedaCambio value for this AdiantamentoItem.
     * 
     * @param valorMoedaCambio
     */
    public void setValorMoedaCambio(java.lang.Double valorMoedaCambio) {
        this.valorMoedaCambio = valorMoedaCambio;
    }


    /**
     * Gets the totalConvertido value for this AdiantamentoItem.
     * 
     * @return totalConvertido
     */
    public java.lang.Double getTotalConvertido() {
        return totalConvertido;
    }


    /**
     * Sets the totalConvertido value for this AdiantamentoItem.
     * 
     * @param totalConvertido
     */
    public void setTotalConvertido(java.lang.Double totalConvertido) {
        this.totalConvertido = totalConvertido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdiantamentoItem)) return false;
        AdiantamentoItem other = (AdiantamentoItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDespesa==null && other.getTipoDespesa()==null) || 
             (this.tipoDespesa!=null &&
              this.tipoDespesa.equals(other.getTipoDespesa()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.codigoDespesa==null && other.getCodigoDespesa()==null) || 
             (this.codigoDespesa!=null &&
              this.codigoDespesa.equals(other.getCodigoDespesa()))) &&
            ((this.classificacao==null && other.getClassificacao()==null) || 
             (this.classificacao!=null &&
              this.classificacao.equals(other.getClassificacao()))) &&
            this.id == other.getId() &&
            ((this.moedaCambio==null && other.getMoedaCambio()==null) || 
             (this.moedaCambio!=null &&
              this.moedaCambio.equals(other.getMoedaCambio()))) &&
            ((this.valorMoedaCambio==null && other.getValorMoedaCambio()==null) || 
             (this.valorMoedaCambio!=null &&
              this.valorMoedaCambio.equals(other.getValorMoedaCambio()))) &&
            ((this.totalConvertido==null && other.getTotalConvertido()==null) || 
             (this.totalConvertido!=null &&
              this.totalConvertido.equals(other.getTotalConvertido())));
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
        if (getTipoDespesa() != null) {
            _hashCode += getTipoDespesa().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getCodigoDespesa() != null) {
            _hashCode += getCodigoDespesa().hashCode();
        }
        if (getClassificacao() != null) {
            _hashCode += getClassificacao().hashCode();
        }
        _hashCode += getId();
        if (getMoedaCambio() != null) {
            _hashCode += getMoedaCambio().hashCode();
        }
        if (getValorMoedaCambio() != null) {
            _hashCode += getValorMoedaCambio().hashCode();
        }
        if (getTotalConvertido() != null) {
            _hashCode += getTotalConvertido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdiantamentoItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moedaCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moedaCambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorMoedaCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorMoedaCambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalConvertido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalConvertido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
