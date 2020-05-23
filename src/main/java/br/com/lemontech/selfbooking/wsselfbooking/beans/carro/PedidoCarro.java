/**
 * PedidoCarro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

public class PedidoCarro  implements java.io.Serializable {
    private java.lang.String cidadeRetirada;

    private java.lang.String estadoRetirada;

    private java.lang.String cidadeDevolucao;

    private java.lang.String estadoDevolucao;

    private java.util.Calendar dataRetirada;

    private java.util.Calendar dataDevolucao;

    private java.lang.String pais;

    private java.lang.String nomeLocadora;

    private java.lang.String modeloPreferencia;

    public PedidoCarro() {
    }

    public PedidoCarro(
           java.lang.String cidadeRetirada,
           java.lang.String estadoRetirada,
           java.lang.String cidadeDevolucao,
           java.lang.String estadoDevolucao,
           java.util.Calendar dataRetirada,
           java.util.Calendar dataDevolucao,
           java.lang.String pais,
           java.lang.String nomeLocadora,
           java.lang.String modeloPreferencia) {
           this.cidadeRetirada = cidadeRetirada;
           this.estadoRetirada = estadoRetirada;
           this.cidadeDevolucao = cidadeDevolucao;
           this.estadoDevolucao = estadoDevolucao;
           this.dataRetirada = dataRetirada;
           this.dataDevolucao = dataDevolucao;
           this.pais = pais;
           this.nomeLocadora = nomeLocadora;
           this.modeloPreferencia = modeloPreferencia;
    }


    /**
     * Gets the cidadeRetirada value for this PedidoCarro.
     * 
     * @return cidadeRetirada
     */
    public java.lang.String getCidadeRetirada() {
        return cidadeRetirada;
    }


    /**
     * Sets the cidadeRetirada value for this PedidoCarro.
     * 
     * @param cidadeRetirada
     */
    public void setCidadeRetirada(java.lang.String cidadeRetirada) {
        this.cidadeRetirada = cidadeRetirada;
    }


    /**
     * Gets the estadoRetirada value for this PedidoCarro.
     * 
     * @return estadoRetirada
     */
    public java.lang.String getEstadoRetirada() {
        return estadoRetirada;
    }


    /**
     * Sets the estadoRetirada value for this PedidoCarro.
     * 
     * @param estadoRetirada
     */
    public void setEstadoRetirada(java.lang.String estadoRetirada) {
        this.estadoRetirada = estadoRetirada;
    }


    /**
     * Gets the cidadeDevolucao value for this PedidoCarro.
     * 
     * @return cidadeDevolucao
     */
    public java.lang.String getCidadeDevolucao() {
        return cidadeDevolucao;
    }


    /**
     * Sets the cidadeDevolucao value for this PedidoCarro.
     * 
     * @param cidadeDevolucao
     */
    public void setCidadeDevolucao(java.lang.String cidadeDevolucao) {
        this.cidadeDevolucao = cidadeDevolucao;
    }


    /**
     * Gets the estadoDevolucao value for this PedidoCarro.
     * 
     * @return estadoDevolucao
     */
    public java.lang.String getEstadoDevolucao() {
        return estadoDevolucao;
    }


    /**
     * Sets the estadoDevolucao value for this PedidoCarro.
     * 
     * @param estadoDevolucao
     */
    public void setEstadoDevolucao(java.lang.String estadoDevolucao) {
        this.estadoDevolucao = estadoDevolucao;
    }


    /**
     * Gets the dataRetirada value for this PedidoCarro.
     * 
     * @return dataRetirada
     */
    public java.util.Calendar getDataRetirada() {
        return dataRetirada;
    }


    /**
     * Sets the dataRetirada value for this PedidoCarro.
     * 
     * @param dataRetirada
     */
    public void setDataRetirada(java.util.Calendar dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


    /**
     * Gets the dataDevolucao value for this PedidoCarro.
     * 
     * @return dataDevolucao
     */
    public java.util.Calendar getDataDevolucao() {
        return dataDevolucao;
    }


    /**
     * Sets the dataDevolucao value for this PedidoCarro.
     * 
     * @param dataDevolucao
     */
    public void setDataDevolucao(java.util.Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    /**
     * Gets the pais value for this PedidoCarro.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this PedidoCarro.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the nomeLocadora value for this PedidoCarro.
     * 
     * @return nomeLocadora
     */
    public java.lang.String getNomeLocadora() {
        return nomeLocadora;
    }


    /**
     * Sets the nomeLocadora value for this PedidoCarro.
     * 
     * @param nomeLocadora
     */
    public void setNomeLocadora(java.lang.String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }


    /**
     * Gets the modeloPreferencia value for this PedidoCarro.
     * 
     * @return modeloPreferencia
     */
    public java.lang.String getModeloPreferencia() {
        return modeloPreferencia;
    }


    /**
     * Sets the modeloPreferencia value for this PedidoCarro.
     * 
     * @param modeloPreferencia
     */
    public void setModeloPreferencia(java.lang.String modeloPreferencia) {
        this.modeloPreferencia = modeloPreferencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PedidoCarro)) return false;
        PedidoCarro other = (PedidoCarro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cidadeRetirada==null && other.getCidadeRetirada()==null) || 
             (this.cidadeRetirada!=null &&
              this.cidadeRetirada.equals(other.getCidadeRetirada()))) &&
            ((this.estadoRetirada==null && other.getEstadoRetirada()==null) || 
             (this.estadoRetirada!=null &&
              this.estadoRetirada.equals(other.getEstadoRetirada()))) &&
            ((this.cidadeDevolucao==null && other.getCidadeDevolucao()==null) || 
             (this.cidadeDevolucao!=null &&
              this.cidadeDevolucao.equals(other.getCidadeDevolucao()))) &&
            ((this.estadoDevolucao==null && other.getEstadoDevolucao()==null) || 
             (this.estadoDevolucao!=null &&
              this.estadoDevolucao.equals(other.getEstadoDevolucao()))) &&
            ((this.dataRetirada==null && other.getDataRetirada()==null) || 
             (this.dataRetirada!=null &&
              this.dataRetirada.equals(other.getDataRetirada()))) &&
            ((this.dataDevolucao==null && other.getDataDevolucao()==null) || 
             (this.dataDevolucao!=null &&
              this.dataDevolucao.equals(other.getDataDevolucao()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.nomeLocadora==null && other.getNomeLocadora()==null) || 
             (this.nomeLocadora!=null &&
              this.nomeLocadora.equals(other.getNomeLocadora()))) &&
            ((this.modeloPreferencia==null && other.getModeloPreferencia()==null) || 
             (this.modeloPreferencia!=null &&
              this.modeloPreferencia.equals(other.getModeloPreferencia())));
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
        if (getCidadeRetirada() != null) {
            _hashCode += getCidadeRetirada().hashCode();
        }
        if (getEstadoRetirada() != null) {
            _hashCode += getEstadoRetirada().hashCode();
        }
        if (getCidadeDevolucao() != null) {
            _hashCode += getCidadeDevolucao().hashCode();
        }
        if (getEstadoDevolucao() != null) {
            _hashCode += getEstadoDevolucao().hashCode();
        }
        if (getDataRetirada() != null) {
            _hashCode += getDataRetirada().hashCode();
        }
        if (getDataDevolucao() != null) {
            _hashCode += getDataDevolucao().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getNomeLocadora() != null) {
            _hashCode += getNomeLocadora().hashCode();
        }
        if (getModeloPreferencia() != null) {
            _hashCode += getModeloPreferencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PedidoCarro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "pedidoCarro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeLocadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeLocadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloPreferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeloPreferencia"));
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
