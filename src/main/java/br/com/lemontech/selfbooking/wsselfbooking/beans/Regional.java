/**
 * Regional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Regional  extends br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef  implements java.io.Serializable {
    private java.lang.String descricao;

    private java.lang.String pcc;

    private java.lang.String identificadorBackofficeCliente;

    private java.lang.String identificadorBackofficeFranquia;

    private boolean ativo;

    private java.lang.Double taxaFee;

    private java.lang.String corporateIdGol;

    private java.lang.String numeroDk;

    private java.lang.String numeroDkTreinamento;

    private java.lang.String numeroDkEvento;

    private java.lang.Boolean emitirNotaFiscalEmNomeDoHospede;

    private java.lang.Boolean emitirNotaFiscalEmNomeDaRegional;

    public Regional() {
    }

    public Regional(
           java.lang.String codigo,
           java.lang.String descricao,
           java.lang.String pcc,
           java.lang.String identificadorBackofficeCliente,
           java.lang.String identificadorBackofficeFranquia,
           boolean ativo,
           java.lang.Double taxaFee,
           java.lang.String corporateIdGol,
           java.lang.String numeroDk,
           java.lang.String numeroDkTreinamento,
           java.lang.String numeroDkEvento,
           java.lang.Boolean emitirNotaFiscalEmNomeDoHospede,
           java.lang.Boolean emitirNotaFiscalEmNomeDaRegional) {
        super(
            codigo);
        this.descricao = descricao;
        this.pcc = pcc;
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
        this.identificadorBackofficeFranquia = identificadorBackofficeFranquia;
        this.ativo = ativo;
        this.taxaFee = taxaFee;
        this.corporateIdGol = corporateIdGol;
        this.numeroDk = numeroDk;
        this.numeroDkTreinamento = numeroDkTreinamento;
        this.numeroDkEvento = numeroDkEvento;
        this.emitirNotaFiscalEmNomeDoHospede = emitirNotaFiscalEmNomeDoHospede;
        this.emitirNotaFiscalEmNomeDaRegional = emitirNotaFiscalEmNomeDaRegional;
    }


    /**
     * Gets the descricao value for this Regional.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Regional.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the pcc value for this Regional.
     * 
     * @return pcc
     */
    public java.lang.String getPcc() {
        return pcc;
    }


    /**
     * Sets the pcc value for this Regional.
     * 
     * @param pcc
     */
    public void setPcc(java.lang.String pcc) {
        this.pcc = pcc;
    }


    /**
     * Gets the identificadorBackofficeCliente value for this Regional.
     * 
     * @return identificadorBackofficeCliente
     */
    public java.lang.String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }


    /**
     * Sets the identificadorBackofficeCliente value for this Regional.
     * 
     * @param identificadorBackofficeCliente
     */
    public void setIdentificadorBackofficeCliente(java.lang.String identificadorBackofficeCliente) {
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
    }


    /**
     * Gets the identificadorBackofficeFranquia value for this Regional.
     * 
     * @return identificadorBackofficeFranquia
     */
    public java.lang.String getIdentificadorBackofficeFranquia() {
        return identificadorBackofficeFranquia;
    }


    /**
     * Sets the identificadorBackofficeFranquia value for this Regional.
     * 
     * @param identificadorBackofficeFranquia
     */
    public void setIdentificadorBackofficeFranquia(java.lang.String identificadorBackofficeFranquia) {
        this.identificadorBackofficeFranquia = identificadorBackofficeFranquia;
    }


    /**
     * Gets the ativo value for this Regional.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this Regional.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the taxaFee value for this Regional.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Regional.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the corporateIdGol value for this Regional.
     * 
     * @return corporateIdGol
     */
    public java.lang.String getCorporateIdGol() {
        return corporateIdGol;
    }


    /**
     * Sets the corporateIdGol value for this Regional.
     * 
     * @param corporateIdGol
     */
    public void setCorporateIdGol(java.lang.String corporateIdGol) {
        this.corporateIdGol = corporateIdGol;
    }


    /**
     * Gets the numeroDk value for this Regional.
     * 
     * @return numeroDk
     */
    public java.lang.String getNumeroDk() {
        return numeroDk;
    }


    /**
     * Sets the numeroDk value for this Regional.
     * 
     * @param numeroDk
     */
    public void setNumeroDk(java.lang.String numeroDk) {
        this.numeroDk = numeroDk;
    }


    /**
     * Gets the numeroDkTreinamento value for this Regional.
     * 
     * @return numeroDkTreinamento
     */
    public java.lang.String getNumeroDkTreinamento() {
        return numeroDkTreinamento;
    }


    /**
     * Sets the numeroDkTreinamento value for this Regional.
     * 
     * @param numeroDkTreinamento
     */
    public void setNumeroDkTreinamento(java.lang.String numeroDkTreinamento) {
        this.numeroDkTreinamento = numeroDkTreinamento;
    }


    /**
     * Gets the numeroDkEvento value for this Regional.
     * 
     * @return numeroDkEvento
     */
    public java.lang.String getNumeroDkEvento() {
        return numeroDkEvento;
    }


    /**
     * Sets the numeroDkEvento value for this Regional.
     * 
     * @param numeroDkEvento
     */
    public void setNumeroDkEvento(java.lang.String numeroDkEvento) {
        this.numeroDkEvento = numeroDkEvento;
    }


    /**
     * Gets the emitirNotaFiscalEmNomeDoHospede value for this Regional.
     * 
     * @return emitirNotaFiscalEmNomeDoHospede
     */
    public java.lang.Boolean getEmitirNotaFiscalEmNomeDoHospede() {
        return emitirNotaFiscalEmNomeDoHospede;
    }


    /**
     * Sets the emitirNotaFiscalEmNomeDoHospede value for this Regional.
     * 
     * @param emitirNotaFiscalEmNomeDoHospede
     */
    public void setEmitirNotaFiscalEmNomeDoHospede(java.lang.Boolean emitirNotaFiscalEmNomeDoHospede) {
        this.emitirNotaFiscalEmNomeDoHospede = emitirNotaFiscalEmNomeDoHospede;
    }


    /**
     * Gets the emitirNotaFiscalEmNomeDaRegional value for this Regional.
     * 
     * @return emitirNotaFiscalEmNomeDaRegional
     */
    public java.lang.Boolean getEmitirNotaFiscalEmNomeDaRegional() {
        return emitirNotaFiscalEmNomeDaRegional;
    }


    /**
     * Sets the emitirNotaFiscalEmNomeDaRegional value for this Regional.
     * 
     * @param emitirNotaFiscalEmNomeDaRegional
     */
    public void setEmitirNotaFiscalEmNomeDaRegional(java.lang.Boolean emitirNotaFiscalEmNomeDaRegional) {
        this.emitirNotaFiscalEmNomeDaRegional = emitirNotaFiscalEmNomeDaRegional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Regional)) return false;
        Regional other = (Regional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.pcc==null && other.getPcc()==null) || 
             (this.pcc!=null &&
              this.pcc.equals(other.getPcc()))) &&
            ((this.identificadorBackofficeCliente==null && other.getIdentificadorBackofficeCliente()==null) || 
             (this.identificadorBackofficeCliente!=null &&
              this.identificadorBackofficeCliente.equals(other.getIdentificadorBackofficeCliente()))) &&
            ((this.identificadorBackofficeFranquia==null && other.getIdentificadorBackofficeFranquia()==null) || 
             (this.identificadorBackofficeFranquia!=null &&
              this.identificadorBackofficeFranquia.equals(other.getIdentificadorBackofficeFranquia()))) &&
            this.ativo == other.isAtivo() &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            ((this.corporateIdGol==null && other.getCorporateIdGol()==null) || 
             (this.corporateIdGol!=null &&
              this.corporateIdGol.equals(other.getCorporateIdGol()))) &&
            ((this.numeroDk==null && other.getNumeroDk()==null) || 
             (this.numeroDk!=null &&
              this.numeroDk.equals(other.getNumeroDk()))) &&
            ((this.numeroDkTreinamento==null && other.getNumeroDkTreinamento()==null) || 
             (this.numeroDkTreinamento!=null &&
              this.numeroDkTreinamento.equals(other.getNumeroDkTreinamento()))) &&
            ((this.numeroDkEvento==null && other.getNumeroDkEvento()==null) || 
             (this.numeroDkEvento!=null &&
              this.numeroDkEvento.equals(other.getNumeroDkEvento()))) &&
            ((this.emitirNotaFiscalEmNomeDoHospede==null && other.getEmitirNotaFiscalEmNomeDoHospede()==null) || 
             (this.emitirNotaFiscalEmNomeDoHospede!=null &&
              this.emitirNotaFiscalEmNomeDoHospede.equals(other.getEmitirNotaFiscalEmNomeDoHospede()))) &&
            ((this.emitirNotaFiscalEmNomeDaRegional==null && other.getEmitirNotaFiscalEmNomeDaRegional()==null) || 
             (this.emitirNotaFiscalEmNomeDaRegional!=null &&
              this.emitirNotaFiscalEmNomeDaRegional.equals(other.getEmitirNotaFiscalEmNomeDaRegional())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getPcc() != null) {
            _hashCode += getPcc().hashCode();
        }
        if (getIdentificadorBackofficeCliente() != null) {
            _hashCode += getIdentificadorBackofficeCliente().hashCode();
        }
        if (getIdentificadorBackofficeFranquia() != null) {
            _hashCode += getIdentificadorBackofficeFranquia().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTaxaFee() != null) {
            _hashCode += getTaxaFee().hashCode();
        }
        if (getCorporateIdGol() != null) {
            _hashCode += getCorporateIdGol().hashCode();
        }
        if (getNumeroDk() != null) {
            _hashCode += getNumeroDk().hashCode();
        }
        if (getNumeroDkTreinamento() != null) {
            _hashCode += getNumeroDkTreinamento().hashCode();
        }
        if (getNumeroDkEvento() != null) {
            _hashCode += getNumeroDkEvento().hashCode();
        }
        if (getEmitirNotaFiscalEmNomeDoHospede() != null) {
            _hashCode += getEmitirNotaFiscalEmNomeDoHospede().hashCode();
        }
        if (getEmitirNotaFiscalEmNomeDaRegional() != null) {
            _hashCode += getEmitirNotaFiscalEmNomeDaRegional().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Regional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeFranquia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeFranquia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateIdGol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateIdGol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDkTreinamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDkTreinamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDkEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDkEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emitirNotaFiscalEmNomeDoHospede");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emitirNotaFiscalEmNomeDoHospede"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emitirNotaFiscalEmNomeDaRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emitirNotaFiscalEmNomeDaRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
