/**
 * FormaPagamentoPrestacaoContaItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class FormaPagamentoPrestacaoContaItem implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FormaPagamentoPrestacaoContaItem(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DINHEIRO = "DINHEIRO";
    public static final java.lang.String _CARTAO_CREDITO = "CARTAO_CREDITO";
    public static final java.lang.String _CARTAO_DEBITO = "CARTAO_DEBITO";
    public static final java.lang.String _CARTAO_CORPORATIVO = "CARTAO_CORPORATIVO";
    public static final java.lang.String _FATURADO = "FATURADO";
    public static final java.lang.String _CARTAO_RENDIMENTO = "CARTAO_RENDIMENTO";
    public static final java.lang.String _RECURSO_PROPRIO = "RECURSO_PROPRIO";
    public static final java.lang.String _DEBITO_EM_CONTA = "DEBITO_EM_CONTA";
    public static final java.lang.String _CREDITO_EM_CONTA = "CREDITO_EM_CONTA";
    public static final FormaPagamentoPrestacaoContaItem DINHEIRO = new FormaPagamentoPrestacaoContaItem(_DINHEIRO);
    public static final FormaPagamentoPrestacaoContaItem CARTAO_CREDITO = new FormaPagamentoPrestacaoContaItem(_CARTAO_CREDITO);
    public static final FormaPagamentoPrestacaoContaItem CARTAO_DEBITO = new FormaPagamentoPrestacaoContaItem(_CARTAO_DEBITO);
    public static final FormaPagamentoPrestacaoContaItem CARTAO_CORPORATIVO = new FormaPagamentoPrestacaoContaItem(_CARTAO_CORPORATIVO);
    public static final FormaPagamentoPrestacaoContaItem FATURADO = new FormaPagamentoPrestacaoContaItem(_FATURADO);
    public static final FormaPagamentoPrestacaoContaItem CARTAO_RENDIMENTO = new FormaPagamentoPrestacaoContaItem(_CARTAO_RENDIMENTO);
    public static final FormaPagamentoPrestacaoContaItem RECURSO_PROPRIO = new FormaPagamentoPrestacaoContaItem(_RECURSO_PROPRIO);
    public static final FormaPagamentoPrestacaoContaItem DEBITO_EM_CONTA = new FormaPagamentoPrestacaoContaItem(_DEBITO_EM_CONTA);
    public static final FormaPagamentoPrestacaoContaItem CREDITO_EM_CONTA = new FormaPagamentoPrestacaoContaItem(_CREDITO_EM_CONTA);
    public java.lang.String getValue() { return _value_;}
    public static FormaPagamentoPrestacaoContaItem fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FormaPagamentoPrestacaoContaItem enumeration = (FormaPagamentoPrestacaoContaItem)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FormaPagamentoPrestacaoContaItem fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FormaPagamentoPrestacaoContaItem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "formaPagamentoPrestacaoContaItem"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
