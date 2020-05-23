/**
 * CadastrarParticipanteTreinamentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarParticipanteTreinamentoRequest  implements java.io.Serializable {
    private java.lang.String matricula;

    private java.lang.String codigoTreinamento;

    private boolean desviaPoliticaAereo;

    private boolean desviaPoliticaHotel;

    private boolean desviaPoliticaCarro;

    private java.lang.String pais;

    private java.lang.String uf;

    private java.lang.String cidade;

    private java.lang.String iata;

    public CadastrarParticipanteTreinamentoRequest() {
    }

    public CadastrarParticipanteTreinamentoRequest(
           java.lang.String matricula,
           java.lang.String codigoTreinamento,
           boolean desviaPoliticaAereo,
           boolean desviaPoliticaHotel,
           boolean desviaPoliticaCarro,
           java.lang.String pais,
           java.lang.String uf,
           java.lang.String cidade,
           java.lang.String iata) {
           this.matricula = matricula;
           this.codigoTreinamento = codigoTreinamento;
           this.desviaPoliticaAereo = desviaPoliticaAereo;
           this.desviaPoliticaHotel = desviaPoliticaHotel;
           this.desviaPoliticaCarro = desviaPoliticaCarro;
           this.pais = pais;
           this.uf = uf;
           this.cidade = cidade;
           this.iata = iata;
    }


    /**
     * Gets the matricula value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the codigoTreinamento value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return codigoTreinamento
     */
    public java.lang.String getCodigoTreinamento() {
        return codigoTreinamento;
    }


    /**
     * Sets the codigoTreinamento value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param codigoTreinamento
     */
    public void setCodigoTreinamento(java.lang.String codigoTreinamento) {
        this.codigoTreinamento = codigoTreinamento;
    }


    /**
     * Gets the desviaPoliticaAereo value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return desviaPoliticaAereo
     */
    public boolean isDesviaPoliticaAereo() {
        return desviaPoliticaAereo;
    }


    /**
     * Sets the desviaPoliticaAereo value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param desviaPoliticaAereo
     */
    public void setDesviaPoliticaAereo(boolean desviaPoliticaAereo) {
        this.desviaPoliticaAereo = desviaPoliticaAereo;
    }


    /**
     * Gets the desviaPoliticaHotel value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return desviaPoliticaHotel
     */
    public boolean isDesviaPoliticaHotel() {
        return desviaPoliticaHotel;
    }


    /**
     * Sets the desviaPoliticaHotel value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param desviaPoliticaHotel
     */
    public void setDesviaPoliticaHotel(boolean desviaPoliticaHotel) {
        this.desviaPoliticaHotel = desviaPoliticaHotel;
    }


    /**
     * Gets the desviaPoliticaCarro value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return desviaPoliticaCarro
     */
    public boolean isDesviaPoliticaCarro() {
        return desviaPoliticaCarro;
    }


    /**
     * Sets the desviaPoliticaCarro value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param desviaPoliticaCarro
     */
    public void setDesviaPoliticaCarro(boolean desviaPoliticaCarro) {
        this.desviaPoliticaCarro = desviaPoliticaCarro;
    }


    /**
     * Gets the pais value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the uf value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the cidade value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the iata value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @return iata
     */
    public java.lang.String getIata() {
        return iata;
    }


    /**
     * Sets the iata value for this CadastrarParticipanteTreinamentoRequest.
     * 
     * @param iata
     */
    public void setIata(java.lang.String iata) {
        this.iata = iata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarParticipanteTreinamentoRequest)) return false;
        CadastrarParticipanteTreinamentoRequest other = (CadastrarParticipanteTreinamentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.codigoTreinamento==null && other.getCodigoTreinamento()==null) || 
             (this.codigoTreinamento!=null &&
              this.codigoTreinamento.equals(other.getCodigoTreinamento()))) &&
            this.desviaPoliticaAereo == other.isDesviaPoliticaAereo() &&
            this.desviaPoliticaHotel == other.isDesviaPoliticaHotel() &&
            this.desviaPoliticaCarro == other.isDesviaPoliticaCarro() &&
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
              this.iata.equals(other.getIata())));
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
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getCodigoTreinamento() != null) {
            _hashCode += getCodigoTreinamento().hashCode();
        }
        _hashCode += (isDesviaPoliticaAereo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDesviaPoliticaHotel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDesviaPoliticaCarro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarParticipanteTreinamentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParticipanteTreinamentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTreinamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTreinamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desviaPoliticaAereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desviaPoliticaAereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desviaPoliticaHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desviaPoliticaHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desviaPoliticaCarro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desviaPoliticaCarro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
