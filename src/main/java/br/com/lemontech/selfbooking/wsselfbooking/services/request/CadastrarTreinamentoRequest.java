/**
 * CadastrarTreinamentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarTreinamentoRequest  implements java.io.Serializable {
    private boolean ativo;

    private java.lang.String codigoTreinamento;

    private java.lang.String descricao;

    private java.lang.String codigoTurma;

    private java.lang.String codigoRegional;

    private java.lang.String codigoCentroDeCusto;

    private java.lang.String codigoSubCentroDeCusto;

    private java.lang.String codigoRegionalContaContabil;

    private java.lang.String codigoContaContabil;

    private java.util.Calendar dataInicio;

    private java.util.Calendar dataFim;

    private java.lang.String pais;

    private java.lang.String uf;

    private java.lang.String cidade;

    private java.lang.String iata;

    private java.lang.String endereco;

    public CadastrarTreinamentoRequest() {
    }

    public CadastrarTreinamentoRequest(
           boolean ativo,
           java.lang.String codigoTreinamento,
           java.lang.String descricao,
           java.lang.String codigoTurma,
           java.lang.String codigoRegional,
           java.lang.String codigoCentroDeCusto,
           java.lang.String codigoSubCentroDeCusto,
           java.lang.String codigoRegionalContaContabil,
           java.lang.String codigoContaContabil,
           java.util.Calendar dataInicio,
           java.util.Calendar dataFim,
           java.lang.String pais,
           java.lang.String uf,
           java.lang.String cidade,
           java.lang.String iata,
           java.lang.String endereco) {
           this.ativo = ativo;
           this.codigoTreinamento = codigoTreinamento;
           this.descricao = descricao;
           this.codigoTurma = codigoTurma;
           this.codigoRegional = codigoRegional;
           this.codigoCentroDeCusto = codigoCentroDeCusto;
           this.codigoSubCentroDeCusto = codigoSubCentroDeCusto;
           this.codigoRegionalContaContabil = codigoRegionalContaContabil;
           this.codigoContaContabil = codigoContaContabil;
           this.dataInicio = dataInicio;
           this.dataFim = dataFim;
           this.pais = pais;
           this.uf = uf;
           this.cidade = cidade;
           this.iata = iata;
           this.endereco = endereco;
    }


    /**
     * Gets the ativo value for this CadastrarTreinamentoRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this CadastrarTreinamentoRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the codigoTreinamento value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoTreinamento
     */
    public java.lang.String getCodigoTreinamento() {
        return codigoTreinamento;
    }


    /**
     * Sets the codigoTreinamento value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoTreinamento
     */
    public void setCodigoTreinamento(java.lang.String codigoTreinamento) {
        this.codigoTreinamento = codigoTreinamento;
    }


    /**
     * Gets the descricao value for this CadastrarTreinamentoRequest.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this CadastrarTreinamentoRequest.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the codigoTurma value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoTurma
     */
    public java.lang.String getCodigoTurma() {
        return codigoTurma;
    }


    /**
     * Sets the codigoTurma value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoTurma
     */
    public void setCodigoTurma(java.lang.String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }


    /**
     * Gets the codigoRegional value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoRegional
     */
    public java.lang.String getCodigoRegional() {
        return codigoRegional;
    }


    /**
     * Sets the codigoRegional value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoRegional
     */
    public void setCodigoRegional(java.lang.String codigoRegional) {
        this.codigoRegional = codigoRegional;
    }


    /**
     * Gets the codigoCentroDeCusto value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoCentroDeCusto
     */
    public java.lang.String getCodigoCentroDeCusto() {
        return codigoCentroDeCusto;
    }


    /**
     * Sets the codigoCentroDeCusto value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoCentroDeCusto
     */
    public void setCodigoCentroDeCusto(java.lang.String codigoCentroDeCusto) {
        this.codigoCentroDeCusto = codigoCentroDeCusto;
    }


    /**
     * Gets the codigoSubCentroDeCusto value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoSubCentroDeCusto
     */
    public java.lang.String getCodigoSubCentroDeCusto() {
        return codigoSubCentroDeCusto;
    }


    /**
     * Sets the codigoSubCentroDeCusto value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoSubCentroDeCusto
     */
    public void setCodigoSubCentroDeCusto(java.lang.String codigoSubCentroDeCusto) {
        this.codigoSubCentroDeCusto = codigoSubCentroDeCusto;
    }


    /**
     * Gets the codigoRegionalContaContabil value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoRegionalContaContabil
     */
    public java.lang.String getCodigoRegionalContaContabil() {
        return codigoRegionalContaContabil;
    }


    /**
     * Sets the codigoRegionalContaContabil value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoRegionalContaContabil
     */
    public void setCodigoRegionalContaContabil(java.lang.String codigoRegionalContaContabil) {
        this.codigoRegionalContaContabil = codigoRegionalContaContabil;
    }


    /**
     * Gets the codigoContaContabil value for this CadastrarTreinamentoRequest.
     * 
     * @return codigoContaContabil
     */
    public java.lang.String getCodigoContaContabil() {
        return codigoContaContabil;
    }


    /**
     * Sets the codigoContaContabil value for this CadastrarTreinamentoRequest.
     * 
     * @param codigoContaContabil
     */
    public void setCodigoContaContabil(java.lang.String codigoContaContabil) {
        this.codigoContaContabil = codigoContaContabil;
    }


    /**
     * Gets the dataInicio value for this CadastrarTreinamentoRequest.
     * 
     * @return dataInicio
     */
    public java.util.Calendar getDataInicio() {
        return dataInicio;
    }


    /**
     * Sets the dataInicio value for this CadastrarTreinamentoRequest.
     * 
     * @param dataInicio
     */
    public void setDataInicio(java.util.Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }


    /**
     * Gets the dataFim value for this CadastrarTreinamentoRequest.
     * 
     * @return dataFim
     */
    public java.util.Calendar getDataFim() {
        return dataFim;
    }


    /**
     * Sets the dataFim value for this CadastrarTreinamentoRequest.
     * 
     * @param dataFim
     */
    public void setDataFim(java.util.Calendar dataFim) {
        this.dataFim = dataFim;
    }


    /**
     * Gets the pais value for this CadastrarTreinamentoRequest.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this CadastrarTreinamentoRequest.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the uf value for this CadastrarTreinamentoRequest.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this CadastrarTreinamentoRequest.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the cidade value for this CadastrarTreinamentoRequest.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this CadastrarTreinamentoRequest.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the iata value for this CadastrarTreinamentoRequest.
     * 
     * @return iata
     */
    public java.lang.String getIata() {
        return iata;
    }


    /**
     * Sets the iata value for this CadastrarTreinamentoRequest.
     * 
     * @param iata
     */
    public void setIata(java.lang.String iata) {
        this.iata = iata;
    }


    /**
     * Gets the endereco value for this CadastrarTreinamentoRequest.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this CadastrarTreinamentoRequest.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarTreinamentoRequest)) return false;
        CadastrarTreinamentoRequest other = (CadastrarTreinamentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.codigoTreinamento==null && other.getCodigoTreinamento()==null) || 
             (this.codigoTreinamento!=null &&
              this.codigoTreinamento.equals(other.getCodigoTreinamento()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.codigoTurma==null && other.getCodigoTurma()==null) || 
             (this.codigoTurma!=null &&
              this.codigoTurma.equals(other.getCodigoTurma()))) &&
            ((this.codigoRegional==null && other.getCodigoRegional()==null) || 
             (this.codigoRegional!=null &&
              this.codigoRegional.equals(other.getCodigoRegional()))) &&
            ((this.codigoCentroDeCusto==null && other.getCodigoCentroDeCusto()==null) || 
             (this.codigoCentroDeCusto!=null &&
              this.codigoCentroDeCusto.equals(other.getCodigoCentroDeCusto()))) &&
            ((this.codigoSubCentroDeCusto==null && other.getCodigoSubCentroDeCusto()==null) || 
             (this.codigoSubCentroDeCusto!=null &&
              this.codigoSubCentroDeCusto.equals(other.getCodigoSubCentroDeCusto()))) &&
            ((this.codigoRegionalContaContabil==null && other.getCodigoRegionalContaContabil()==null) || 
             (this.codigoRegionalContaContabil!=null &&
              this.codigoRegionalContaContabil.equals(other.getCodigoRegionalContaContabil()))) &&
            ((this.codigoContaContabil==null && other.getCodigoContaContabil()==null) || 
             (this.codigoContaContabil!=null &&
              this.codigoContaContabil.equals(other.getCodigoContaContabil()))) &&
            ((this.dataInicio==null && other.getDataInicio()==null) || 
             (this.dataInicio!=null &&
              this.dataInicio.equals(other.getDataInicio()))) &&
            ((this.dataFim==null && other.getDataFim()==null) || 
             (this.dataFim!=null &&
              this.dataFim.equals(other.getDataFim()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.iata==null && other.getIata()==null) || 
             (this.iata!=null &&
              this.iata.equals(other.getIata()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco())));
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
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodigoTreinamento() != null) {
            _hashCode += getCodigoTreinamento().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getCodigoTurma() != null) {
            _hashCode += getCodigoTurma().hashCode();
        }
        if (getCodigoRegional() != null) {
            _hashCode += getCodigoRegional().hashCode();
        }
        if (getCodigoCentroDeCusto() != null) {
            _hashCode += getCodigoCentroDeCusto().hashCode();
        }
        if (getCodigoSubCentroDeCusto() != null) {
            _hashCode += getCodigoSubCentroDeCusto().hashCode();
        }
        if (getCodigoRegionalContaContabil() != null) {
            _hashCode += getCodigoRegionalContaContabil().hashCode();
        }
        if (getCodigoContaContabil() != null) {
            _hashCode += getCodigoContaContabil().hashCode();
        }
        if (getDataInicio() != null) {
            _hashCode += getDataInicio().hashCode();
        }
        if (getDataFim() != null) {
            _hashCode += getDataFim().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getIata() != null) {
            _hashCode += getIata().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarTreinamentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarTreinamentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTreinamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTreinamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTurma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTurma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCentroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSubCentroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSubCentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRegionalContaContabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRegionalContaContabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoContaContabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoContaContabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
