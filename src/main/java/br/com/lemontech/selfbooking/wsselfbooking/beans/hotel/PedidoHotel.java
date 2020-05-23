/**
 * PedidoHotel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.hotel;

public class PedidoHotel  implements java.io.Serializable {
    private java.lang.String cidade;

    /* Ex: MT,RJ,PE... */
    private java.lang.String estado;

    private java.lang.String pais;

    private java.util.Calendar checkIn;

    private java.util.Calendar checkOut;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento;

    public PedidoHotel() {
    }

    public PedidoHotel(
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String pais,
           java.util.Calendar checkIn,
           java.util.Calendar checkOut,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento) {
           this.cidade = cidade;
           this.estado = estado;
           this.pais = pais;
           this.checkIn = checkIn;
           this.checkOut = checkOut;
           this.tipoApartamento = tipoApartamento;
           this.categoriaApartamento = categoriaApartamento;
    }


    /**
     * Gets the cidade value for this PedidoHotel.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this PedidoHotel.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this PedidoHotel.
     * 
     * @return estado   * Ex: MT,RJ,PE...
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this PedidoHotel.
     * 
     * @param estado   * Ex: MT,RJ,PE...
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the pais value for this PedidoHotel.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this PedidoHotel.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the checkIn value for this PedidoHotel.
     * 
     * @return checkIn
     */
    public java.util.Calendar getCheckIn() {
        return checkIn;
    }


    /**
     * Sets the checkIn value for this PedidoHotel.
     * 
     * @param checkIn
     */
    public void setCheckIn(java.util.Calendar checkIn) {
        this.checkIn = checkIn;
    }


    /**
     * Gets the checkOut value for this PedidoHotel.
     * 
     * @return checkOut
     */
    public java.util.Calendar getCheckOut() {
        return checkOut;
    }


    /**
     * Sets the checkOut value for this PedidoHotel.
     * 
     * @param checkOut
     */
    public void setCheckOut(java.util.Calendar checkOut) {
        this.checkOut = checkOut;
    }


    /**
     * Gets the tipoApartamento value for this PedidoHotel.
     * 
     * @return tipoApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }


    /**
     * Sets the tipoApartamento value for this PedidoHotel.
     * 
     * @param tipoApartamento
     */
    public void setTipoApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }


    /**
     * Gets the categoriaApartamento value for this PedidoHotel.
     * 
     * @return categoriaApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento getCategoriaApartamento() {
        return categoriaApartamento;
    }


    /**
     * Sets the categoriaApartamento value for this PedidoHotel.
     * 
     * @param categoriaApartamento
     */
    public void setCategoriaApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento) {
        this.categoriaApartamento = categoriaApartamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PedidoHotel)) return false;
        PedidoHotel other = (PedidoHotel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.checkIn==null && other.getCheckIn()==null) || 
             (this.checkIn!=null &&
              this.checkIn.equals(other.getCheckIn()))) &&
            ((this.checkOut==null && other.getCheckOut()==null) || 
             (this.checkOut!=null &&
              this.checkOut.equals(other.getCheckOut()))) &&
            ((this.tipoApartamento==null && other.getTipoApartamento()==null) || 
             (this.tipoApartamento!=null &&
              this.tipoApartamento.equals(other.getTipoApartamento()))) &&
            ((this.categoriaApartamento==null && other.getCategoriaApartamento()==null) || 
             (this.categoriaApartamento!=null &&
              this.categoriaApartamento.equals(other.getCategoriaApartamento())));
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
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getCheckIn() != null) {
            _hashCode += getCheckIn().hashCode();
        }
        if (getCheckOut() != null) {
            _hashCode += getCheckOut().hashCode();
        }
        if (getTipoApartamento() != null) {
            _hashCode += getTipoApartamento().hashCode();
        }
        if (getCategoriaApartamento() != null) {
            _hashCode += getCategoriaApartamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PedidoHotel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "pedidoHotel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoApartamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriaApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoriaApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "categoriaApartamento"));
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
