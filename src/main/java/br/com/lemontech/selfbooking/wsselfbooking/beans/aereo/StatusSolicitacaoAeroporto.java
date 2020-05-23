/**
 * StatusSolicitacaoAeroporto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class StatusSolicitacaoAeroporto implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusSolicitacaoAeroporto(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PENDENTE = "PENDENTE";
    public static final java.lang.String _NO_SHOW = "NO_SHOW";
    public static final java.lang.String _CANCELADO = "CANCELADO";
    public static final java.lang.String _FINALIZADO = "FINALIZADO";
    public static final java.lang.String _TERCEIRO = "TERCEIRO";
    public static final java.lang.String _SOLICITACAO_SALVA = "SOLICITACAO_SALVA";
    public static final StatusSolicitacaoAeroporto PENDENTE = new StatusSolicitacaoAeroporto(_PENDENTE);
    public static final StatusSolicitacaoAeroporto NO_SHOW = new StatusSolicitacaoAeroporto(_NO_SHOW);
    public static final StatusSolicitacaoAeroporto CANCELADO = new StatusSolicitacaoAeroporto(_CANCELADO);
    public static final StatusSolicitacaoAeroporto FINALIZADO = new StatusSolicitacaoAeroporto(_FINALIZADO);
    public static final StatusSolicitacaoAeroporto TERCEIRO = new StatusSolicitacaoAeroporto(_TERCEIRO);
    public static final StatusSolicitacaoAeroporto SOLICITACAO_SALVA = new StatusSolicitacaoAeroporto(_SOLICITACAO_SALVA);
    public java.lang.String getValue() { return _value_;}
    public static StatusSolicitacaoAeroporto fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusSolicitacaoAeroporto enumeration = (StatusSolicitacaoAeroporto)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusSolicitacaoAeroporto fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusSolicitacaoAeroporto.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "statusSolicitacaoAeroporto"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
