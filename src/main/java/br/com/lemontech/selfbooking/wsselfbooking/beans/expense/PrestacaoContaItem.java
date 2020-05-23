/**
 * PrestacaoContaItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class PrestacaoContaItem  implements java.io.Serializable {
    private java.lang.String tipoDespesa;

    private java.lang.Double valor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private java.lang.String urlImagem;

    private java.lang.String observacao;

    private java.lang.String identificadorExterno;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento;

    private java.lang.String codigoDespesa;

    private java.lang.Boolean reembolsavel;

    private java.lang.Boolean custoCliente;

    private java.lang.String nomeClienteCusto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem;

    private java.lang.String classificacao;

    private int id;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio;

    private java.lang.Double valorMoedaCambio;

    private java.lang.Double totalConvertido;

    public PrestacaoContaItem() {
    }

    public PrestacaoContaItem(
           java.lang.String tipoDespesa,
           java.lang.Double valor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           java.lang.String urlImagem,
           java.lang.String observacao,
           java.lang.String identificadorExterno,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento,
           java.lang.String codigoDespesa,
           java.lang.Boolean reembolsavel,
           java.lang.Boolean custoCliente,
           java.lang.String nomeClienteCusto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem,
           java.lang.String classificacao,
           int id,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio,
           java.lang.Double valorMoedaCambio,
           java.lang.Double totalConvertido) {
           this.tipoDespesa = tipoDespesa;
           this.valor = valor;
           this.moeda = moeda;
           this.urlImagem = urlImagem;
           this.observacao = observacao;
           this.identificadorExterno = identificadorExterno;
           this.deslocamento = deslocamento;
           this.codigoDespesa = codigoDespesa;
           this.reembolsavel = reembolsavel;
           this.custoCliente = custoCliente;
           this.nomeClienteCusto = nomeClienteCusto;
           this.formaPagamentoPrestacaoContaItem = formaPagamentoPrestacaoContaItem;
           this.classificacao = classificacao;
           this.id = id;
           this.moedaCambio = moedaCambio;
           this.valorMoedaCambio = valorMoedaCambio;
           this.totalConvertido = totalConvertido;
    }


    /**
     * Gets the tipoDespesa value for this PrestacaoContaItem.
     * 
     * @return tipoDespesa
     */
    public java.lang.String getTipoDespesa() {
        return tipoDespesa;
    }


    /**
     * Sets the tipoDespesa value for this PrestacaoContaItem.
     * 
     * @param tipoDespesa
     */
    public void setTipoDespesa(java.lang.String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    /**
     * Gets the valor value for this PrestacaoContaItem.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this PrestacaoContaItem.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the moeda value for this PrestacaoContaItem.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this PrestacaoContaItem.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the urlImagem value for this PrestacaoContaItem.
     * 
     * @return urlImagem
     */
    public java.lang.String getUrlImagem() {
        return urlImagem;
    }


    /**
     * Sets the urlImagem value for this PrestacaoContaItem.
     * 
     * @param urlImagem
     */
    public void setUrlImagem(java.lang.String urlImagem) {
        this.urlImagem = urlImagem;
    }


    /**
     * Gets the observacao value for this PrestacaoContaItem.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this PrestacaoContaItem.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the identificadorExterno value for this PrestacaoContaItem.
     * 
     * @return identificadorExterno
     */
    public java.lang.String getIdentificadorExterno() {
        return identificadorExterno;
    }


    /**
     * Sets the identificadorExterno value for this PrestacaoContaItem.
     * 
     * @param identificadorExterno
     */
    public void setIdentificadorExterno(java.lang.String identificadorExterno) {
        this.identificadorExterno = identificadorExterno;
    }


    /**
     * Gets the deslocamento value for this PrestacaoContaItem.
     * 
     * @return deslocamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }


    /**
     * Sets the deslocamento value for this PrestacaoContaItem.
     * 
     * @param deslocamento
     */
    public void setDeslocamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento) {
        this.deslocamento = deslocamento;
    }


    /**
     * Gets the codigoDespesa value for this PrestacaoContaItem.
     * 
     * @return codigoDespesa
     */
    public java.lang.String getCodigoDespesa() {
        return codigoDespesa;
    }


    /**
     * Sets the codigoDespesa value for this PrestacaoContaItem.
     * 
     * @param codigoDespesa
     */
    public void setCodigoDespesa(java.lang.String codigoDespesa) {
        this.codigoDespesa = codigoDespesa;
    }


    /**
     * Gets the reembolsavel value for this PrestacaoContaItem.
     * 
     * @return reembolsavel
     */
    public java.lang.Boolean getReembolsavel() {
        return reembolsavel;
    }


    /**
     * Sets the reembolsavel value for this PrestacaoContaItem.
     * 
     * @param reembolsavel
     */
    public void setReembolsavel(java.lang.Boolean reembolsavel) {
        this.reembolsavel = reembolsavel;
    }


    /**
     * Gets the custoCliente value for this PrestacaoContaItem.
     * 
     * @return custoCliente
     */
    public java.lang.Boolean getCustoCliente() {
        return custoCliente;
    }


    /**
     * Sets the custoCliente value for this PrestacaoContaItem.
     * 
     * @param custoCliente
     */
    public void setCustoCliente(java.lang.Boolean custoCliente) {
        this.custoCliente = custoCliente;
    }


    /**
     * Gets the nomeClienteCusto value for this PrestacaoContaItem.
     * 
     * @return nomeClienteCusto
     */
    public java.lang.String getNomeClienteCusto() {
        return nomeClienteCusto;
    }


    /**
     * Sets the nomeClienteCusto value for this PrestacaoContaItem.
     * 
     * @param nomeClienteCusto
     */
    public void setNomeClienteCusto(java.lang.String nomeClienteCusto) {
        this.nomeClienteCusto = nomeClienteCusto;
    }


    /**
     * Gets the formaPagamentoPrestacaoContaItem value for this PrestacaoContaItem.
     * 
     * @return formaPagamentoPrestacaoContaItem
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.FormaPagamentoPrestacaoContaItem getFormaPagamentoPrestacaoContaItem() {
        return formaPagamentoPrestacaoContaItem;
    }


    /**
     * Sets the formaPagamentoPrestacaoContaItem value for this PrestacaoContaItem.
     * 
     * @param formaPagamentoPrestacaoContaItem
     */
    public void setFormaPagamentoPrestacaoContaItem(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem) {
        this.formaPagamentoPrestacaoContaItem = formaPagamentoPrestacaoContaItem;
    }


    /**
     * Gets the classificacao value for this PrestacaoContaItem.
     * 
     * @return classificacao
     */
    public java.lang.String getClassificacao() {
        return classificacao;
    }


    /**
     * Sets the classificacao value for this PrestacaoContaItem.
     * 
     * @param classificacao
     */
    public void setClassificacao(java.lang.String classificacao) {
        this.classificacao = classificacao;
    }


    /**
     * Gets the id value for this PrestacaoContaItem.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PrestacaoContaItem.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the moedaCambio value for this PrestacaoContaItem.
     * 
     * @return moedaCambio
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoedaCambio() {
        return moedaCambio;
    }


    /**
     * Sets the moedaCambio value for this PrestacaoContaItem.
     * 
     * @param moedaCambio
     */
    public void setMoedaCambio(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaCambio) {
        this.moedaCambio = moedaCambio;
    }


    /**
     * Gets the valorMoedaCambio value for this PrestacaoContaItem.
     * 
     * @return valorMoedaCambio
     */
    public java.lang.Double getValorMoedaCambio() {
        return valorMoedaCambio;
    }


    /**
     * Sets the valorMoedaCambio value for this PrestacaoContaItem.
     * 
     * @param valorMoedaCambio
     */
    public void setValorMoedaCambio(java.lang.Double valorMoedaCambio) {
        this.valorMoedaCambio = valorMoedaCambio;
    }


    /**
     * Gets the totalConvertido value for this PrestacaoContaItem.
     * 
     * @return totalConvertido
     */
    public java.lang.Double getTotalConvertido() {
        return totalConvertido;
    }


    /**
     * Sets the totalConvertido value for this PrestacaoContaItem.
     * 
     * @param totalConvertido
     */
    public void setTotalConvertido(java.lang.Double totalConvertido) {
        this.totalConvertido = totalConvertido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrestacaoContaItem)) return false;
        PrestacaoContaItem other = (PrestacaoContaItem) obj;
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
            ((this.urlImagem==null && other.getUrlImagem()==null) || 
             (this.urlImagem!=null &&
              this.urlImagem.equals(other.getUrlImagem()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.identificadorExterno==null && other.getIdentificadorExterno()==null) || 
             (this.identificadorExterno!=null &&
              this.identificadorExterno.equals(other.getIdentificadorExterno()))) &&
            ((this.deslocamento==null && other.getDeslocamento()==null) || 
             (this.deslocamento!=null &&
              this.deslocamento.equals(other.getDeslocamento()))) &&
            ((this.codigoDespesa==null && other.getCodigoDespesa()==null) || 
             (this.codigoDespesa!=null &&
              this.codigoDespesa.equals(other.getCodigoDespesa()))) &&
            ((this.reembolsavel==null && other.getReembolsavel()==null) || 
             (this.reembolsavel!=null &&
              this.reembolsavel.equals(other.getReembolsavel()))) &&
            ((this.custoCliente==null && other.getCustoCliente()==null) || 
             (this.custoCliente!=null &&
              this.custoCliente.equals(other.getCustoCliente()))) &&
            ((this.nomeClienteCusto==null && other.getNomeClienteCusto()==null) || 
             (this.nomeClienteCusto!=null &&
              this.nomeClienteCusto.equals(other.getNomeClienteCusto()))) &&
            ((this.formaPagamentoPrestacaoContaItem==null && other.getFormaPagamentoPrestacaoContaItem()==null) || 
             (this.formaPagamentoPrestacaoContaItem!=null &&
              this.formaPagamentoPrestacaoContaItem.equals(other.getFormaPagamentoPrestacaoContaItem()))) &&
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
        if (getUrlImagem() != null) {
            _hashCode += getUrlImagem().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getIdentificadorExterno() != null) {
            _hashCode += getIdentificadorExterno().hashCode();
        }
        if (getDeslocamento() != null) {
            _hashCode += getDeslocamento().hashCode();
        }
        if (getCodigoDespesa() != null) {
            _hashCode += getCodigoDespesa().hashCode();
        }
        if (getReembolsavel() != null) {
            _hashCode += getReembolsavel().hashCode();
        }
        if (getCustoCliente() != null) {
            _hashCode += getCustoCliente().hashCode();
        }
        if (getNomeClienteCusto() != null) {
            _hashCode += getNomeClienteCusto().hashCode();
        }
        if (getFormaPagamentoPrestacaoContaItem() != null) {
            _hashCode += getFormaPagamentoPrestacaoContaItem().hashCode();
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
        new org.apache.axis.description.TypeDesc(PrestacaoContaItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItem"));
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
        elemField.setFieldName("urlImagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlImagem"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorExterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorExterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deslocamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deslocamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "deslocamentoTerrestre"));
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
        elemField.setFieldName("reembolsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reembolsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeClienteCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeClienteCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagamentoPrestacaoContaItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagamentoPrestacaoContaItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "formaPagamentoPrestacaoContaItem"));
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
