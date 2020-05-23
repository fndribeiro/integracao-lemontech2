/**
 * ImportarFaturaCartaoCreditoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class ImportarFaturaCartaoCreditoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTransacaoCartao tipoTransacao;

    private java.util.Date dataTransacao;

    private double valorTransacao;

    private java.lang.Integer numeroAutorizacao;

    private java.lang.String codCia;

    private java.lang.String bilhete;

    private java.lang.Double valorBilhete;

    private java.lang.Double valorTaxa;

    private java.lang.String numeroCartao;

    private java.lang.String campoGerencial1;

    private java.lang.String campoGerencial2;

    private java.lang.String campoGerencial3;

    private java.lang.String campoGerencial4;

    private java.lang.String campoGerencial5;

    public ImportarFaturaCartaoCreditoRequest() {
    }

    public ImportarFaturaCartaoCreditoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTransacaoCartao tipoTransacao,
           java.util.Date dataTransacao,
           double valorTransacao,
           java.lang.Integer numeroAutorizacao,
           java.lang.String codCia,
           java.lang.String bilhete,
           java.lang.Double valorBilhete,
           java.lang.Double valorTaxa,
           java.lang.String numeroCartao,
           java.lang.String campoGerencial1,
           java.lang.String campoGerencial2,
           java.lang.String campoGerencial3,
           java.lang.String campoGerencial4,
           java.lang.String campoGerencial5) {
           this.tipoTransacao = tipoTransacao;
           this.dataTransacao = dataTransacao;
           this.valorTransacao = valorTransacao;
           this.numeroAutorizacao = numeroAutorizacao;
           this.codCia = codCia;
           this.bilhete = bilhete;
           this.valorBilhete = valorBilhete;
           this.valorTaxa = valorTaxa;
           this.numeroCartao = numeroCartao;
           this.campoGerencial1 = campoGerencial1;
           this.campoGerencial2 = campoGerencial2;
           this.campoGerencial3 = campoGerencial3;
           this.campoGerencial4 = campoGerencial4;
           this.campoGerencial5 = campoGerencial5;
    }


    /**
     * Gets the tipoTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return tipoTransacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTransacaoCartao getTipoTransacao() {
        return tipoTransacao;
    }


    /**
     * Sets the tipoTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param tipoTransacao
     */
    public void setTipoTransacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTransacaoCartao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }


    /**
     * Gets the dataTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return dataTransacao
     */
    public java.util.Date getDataTransacao() {
        return dataTransacao;
    }


    /**
     * Sets the dataTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param dataTransacao
     */
    public void setDataTransacao(java.util.Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }


    /**
     * Gets the valorTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return valorTransacao
     */
    public double getValorTransacao() {
        return valorTransacao;
    }


    /**
     * Sets the valorTransacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param valorTransacao
     */
    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }


    /**
     * Gets the numeroAutorizacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return numeroAutorizacao
     */
    public java.lang.Integer getNumeroAutorizacao() {
        return numeroAutorizacao;
    }


    /**
     * Sets the numeroAutorizacao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param numeroAutorizacao
     */
    public void setNumeroAutorizacao(java.lang.Integer numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }


    /**
     * Gets the codCia value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return codCia
     */
    public java.lang.String getCodCia() {
        return codCia;
    }


    /**
     * Sets the codCia value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param codCia
     */
    public void setCodCia(java.lang.String codCia) {
        this.codCia = codCia;
    }


    /**
     * Gets the bilhete value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return bilhete
     */
    public java.lang.String getBilhete() {
        return bilhete;
    }


    /**
     * Sets the bilhete value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param bilhete
     */
    public void setBilhete(java.lang.String bilhete) {
        this.bilhete = bilhete;
    }


    /**
     * Gets the valorBilhete value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return valorBilhete
     */
    public java.lang.Double getValorBilhete() {
        return valorBilhete;
    }


    /**
     * Sets the valorBilhete value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param valorBilhete
     */
    public void setValorBilhete(java.lang.Double valorBilhete) {
        this.valorBilhete = valorBilhete;
    }


    /**
     * Gets the valorTaxa value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return valorTaxa
     */
    public java.lang.Double getValorTaxa() {
        return valorTaxa;
    }


    /**
     * Sets the valorTaxa value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param valorTaxa
     */
    public void setValorTaxa(java.lang.Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }


    /**
     * Gets the numeroCartao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return numeroCartao
     */
    public java.lang.String getNumeroCartao() {
        return numeroCartao;
    }


    /**
     * Sets the numeroCartao value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param numeroCartao
     */
    public void setNumeroCartao(java.lang.String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    /**
     * Gets the campoGerencial1 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return campoGerencial1
     */
    public java.lang.String getCampoGerencial1() {
        return campoGerencial1;
    }


    /**
     * Sets the campoGerencial1 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param campoGerencial1
     */
    public void setCampoGerencial1(java.lang.String campoGerencial1) {
        this.campoGerencial1 = campoGerencial1;
    }


    /**
     * Gets the campoGerencial2 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return campoGerencial2
     */
    public java.lang.String getCampoGerencial2() {
        return campoGerencial2;
    }


    /**
     * Sets the campoGerencial2 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param campoGerencial2
     */
    public void setCampoGerencial2(java.lang.String campoGerencial2) {
        this.campoGerencial2 = campoGerencial2;
    }


    /**
     * Gets the campoGerencial3 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return campoGerencial3
     */
    public java.lang.String getCampoGerencial3() {
        return campoGerencial3;
    }


    /**
     * Sets the campoGerencial3 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param campoGerencial3
     */
    public void setCampoGerencial3(java.lang.String campoGerencial3) {
        this.campoGerencial3 = campoGerencial3;
    }


    /**
     * Gets the campoGerencial4 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return campoGerencial4
     */
    public java.lang.String getCampoGerencial4() {
        return campoGerencial4;
    }


    /**
     * Sets the campoGerencial4 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param campoGerencial4
     */
    public void setCampoGerencial4(java.lang.String campoGerencial4) {
        this.campoGerencial4 = campoGerencial4;
    }


    /**
     * Gets the campoGerencial5 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @return campoGerencial5
     */
    public java.lang.String getCampoGerencial5() {
        return campoGerencial5;
    }


    /**
     * Sets the campoGerencial5 value for this ImportarFaturaCartaoCreditoRequest.
     * 
     * @param campoGerencial5
     */
    public void setCampoGerencial5(java.lang.String campoGerencial5) {
        this.campoGerencial5 = campoGerencial5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportarFaturaCartaoCreditoRequest)) return false;
        ImportarFaturaCartaoCreditoRequest other = (ImportarFaturaCartaoCreditoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoTransacao==null && other.getTipoTransacao()==null) || 
             (this.tipoTransacao!=null &&
              this.tipoTransacao.equals(other.getTipoTransacao()))) &&
            ((this.dataTransacao==null && other.getDataTransacao()==null) || 
             (this.dataTransacao!=null &&
              this.dataTransacao.equals(other.getDataTransacao()))) &&
            this.valorTransacao == other.getValorTransacao() &&
            ((this.numeroAutorizacao==null && other.getNumeroAutorizacao()==null) || 
             (this.numeroAutorizacao!=null &&
              this.numeroAutorizacao.equals(other.getNumeroAutorizacao()))) &&
            ((this.codCia==null && other.getCodCia()==null) || 
             (this.codCia!=null &&
              this.codCia.equals(other.getCodCia()))) &&
            ((this.bilhete==null && other.getBilhete()==null) || 
             (this.bilhete!=null &&
              this.bilhete.equals(other.getBilhete()))) &&
            ((this.valorBilhete==null && other.getValorBilhete()==null) || 
             (this.valorBilhete!=null &&
              this.valorBilhete.equals(other.getValorBilhete()))) &&
            ((this.valorTaxa==null && other.getValorTaxa()==null) || 
             (this.valorTaxa!=null &&
              this.valorTaxa.equals(other.getValorTaxa()))) &&
            ((this.numeroCartao==null && other.getNumeroCartao()==null) || 
             (this.numeroCartao!=null &&
              this.numeroCartao.equals(other.getNumeroCartao()))) &&
            ((this.campoGerencial1==null && other.getCampoGerencial1()==null) || 
             (this.campoGerencial1!=null &&
              this.campoGerencial1.equals(other.getCampoGerencial1()))) &&
            ((this.campoGerencial2==null && other.getCampoGerencial2()==null) || 
             (this.campoGerencial2!=null &&
              this.campoGerencial2.equals(other.getCampoGerencial2()))) &&
            ((this.campoGerencial3==null && other.getCampoGerencial3()==null) || 
             (this.campoGerencial3!=null &&
              this.campoGerencial3.equals(other.getCampoGerencial3()))) &&
            ((this.campoGerencial4==null && other.getCampoGerencial4()==null) || 
             (this.campoGerencial4!=null &&
              this.campoGerencial4.equals(other.getCampoGerencial4()))) &&
            ((this.campoGerencial5==null && other.getCampoGerencial5()==null) || 
             (this.campoGerencial5!=null &&
              this.campoGerencial5.equals(other.getCampoGerencial5())));
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
        if (getTipoTransacao() != null) {
            _hashCode += getTipoTransacao().hashCode();
        }
        if (getDataTransacao() != null) {
            _hashCode += getDataTransacao().hashCode();
        }
        _hashCode += new Double(getValorTransacao()).hashCode();
        if (getNumeroAutorizacao() != null) {
            _hashCode += getNumeroAutorizacao().hashCode();
        }
        if (getCodCia() != null) {
            _hashCode += getCodCia().hashCode();
        }
        if (getBilhete() != null) {
            _hashCode += getBilhete().hashCode();
        }
        if (getValorBilhete() != null) {
            _hashCode += getValorBilhete().hashCode();
        }
        if (getValorTaxa() != null) {
            _hashCode += getValorTaxa().hashCode();
        }
        if (getNumeroCartao() != null) {
            _hashCode += getNumeroCartao().hashCode();
        }
        if (getCampoGerencial1() != null) {
            _hashCode += getCampoGerencial1().hashCode();
        }
        if (getCampoGerencial2() != null) {
            _hashCode += getCampoGerencial2().hashCode();
        }
        if (getCampoGerencial3() != null) {
            _hashCode += getCampoGerencial3().hashCode();
        }
        if (getCampoGerencial4() != null) {
            _hashCode += getCampoGerencial4().hashCode();
        }
        if (getCampoGerencial5() != null) {
            _hashCode += getCampoGerencial5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportarFaturaCartaoCreditoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "importarFaturaCartaoCreditoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoTransacaoCartao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAutorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAutorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilhete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilhete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorBilhete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorBilhete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTaxa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTaxa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoGerencial1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoGerencial1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoGerencial2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoGerencial2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoGerencial3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoGerencial3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoGerencial4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoGerencial4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campoGerencial5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campoGerencial5"));
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
