/**
 * PedidoAereo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class PedidoAereo  implements java.io.Serializable {
    private java.lang.String aeroportoOrigem;

    private java.lang.String aeroportoDestino;

    private java.util.Calendar dataPartida;

    private boolean tarifaCombinada;

    private boolean bagagem;

    public PedidoAereo() {
    }

    public PedidoAereo(
           java.lang.String aeroportoOrigem,
           java.lang.String aeroportoDestino,
           java.util.Calendar dataPartida,
           boolean tarifaCombinada,
           boolean bagagem) {
           this.aeroportoOrigem = aeroportoOrigem;
           this.aeroportoDestino = aeroportoDestino;
           this.dataPartida = dataPartida;
           this.tarifaCombinada = tarifaCombinada;
           this.bagagem = bagagem;
    }


    /**
     * Gets the aeroportoOrigem value for this PedidoAereo.
     * 
     * @return aeroportoOrigem
     */
    public java.lang.String getAeroportoOrigem() {
        return aeroportoOrigem;
    }


    /**
     * Sets the aeroportoOrigem value for this PedidoAereo.
     * 
     * @param aeroportoOrigem
     */
    public void setAeroportoOrigem(java.lang.String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }


    /**
     * Gets the aeroportoDestino value for this PedidoAereo.
     * 
     * @return aeroportoDestino
     */
    public java.lang.String getAeroportoDestino() {
        return aeroportoDestino;
    }


    /**
     * Sets the aeroportoDestino value for this PedidoAereo.
     * 
     * @param aeroportoDestino
     */
    public void setAeroportoDestino(java.lang.String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }


    /**
     * Gets the dataPartida value for this PedidoAereo.
     * 
     * @return dataPartida
     */
    public java.util.Calendar getDataPartida() {
        return dataPartida;
    }


    /**
     * Sets the dataPartida value for this PedidoAereo.
     * 
     * @param dataPartida
     */
    public void setDataPartida(java.util.Calendar dataPartida) {
        this.dataPartida = dataPartida;
    }


    /**
     * Gets the tarifaCombinada value for this PedidoAereo.
     * 
     * @return tarifaCombinada
     */
    public boolean isTarifaCombinada() {
        return tarifaCombinada;
    }


    /**
     * Sets the tarifaCombinada value for this PedidoAereo.
     * 
     * @param tarifaCombinada
     */
    public void setTarifaCombinada(boolean tarifaCombinada) {
        this.tarifaCombinada = tarifaCombinada;
    }


    /**
     * Gets the bagagem value for this PedidoAereo.
     * 
     * @return bagagem
     */
    public boolean isBagagem() {
        return bagagem;
    }


    /**
     * Sets the bagagem value for this PedidoAereo.
     * 
     * @param bagagem
     */
    public void setBagagem(boolean bagagem) {
        this.bagagem = bagagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PedidoAereo)) return false;
        PedidoAereo other = (PedidoAereo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aeroportoOrigem==null && other.getAeroportoOrigem()==null) || 
             (this.aeroportoOrigem!=null &&
              this.aeroportoOrigem.equals(other.getAeroportoOrigem()))) &&
            ((this.aeroportoDestino==null && other.getAeroportoDestino()==null) || 
             (this.aeroportoDestino!=null &&
              this.aeroportoDestino.equals(other.getAeroportoDestino()))) &&
            ((this.dataPartida==null && other.getDataPartida()==null) || 
             (this.dataPartida!=null &&
              this.dataPartida.equals(other.getDataPartida()))) &&
            this.tarifaCombinada == other.isTarifaCombinada() &&
            this.bagagem == other.isBagagem();
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
        if (getAeroportoOrigem() != null) {
            _hashCode += getAeroportoOrigem().hashCode();
        }
        if (getAeroportoDestino() != null) {
            _hashCode += getAeroportoDestino().hashCode();
        }
        if (getDataPartida() != null) {
            _hashCode += getDataPartida().hashCode();
        }
        _hashCode += (isTarifaCombinada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBagagem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PedidoAereo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "pedidoAereo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aeroportoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aeroportoOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aeroportoDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aeroportoDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPartida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPartida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaCombinada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaCombinada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bagagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bagagem"));
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
