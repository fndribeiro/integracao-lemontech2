/**
 * CriarPreSolicitacaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CriarPreSolicitacaoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef solicitante;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef passageiro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef[] acompanhantes;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.PedidoAereo[] pedidosAereos;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.PedidoHotel[] pedidosHoteis;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.carro.PedidoCarro[] pedidosCarros;

    private java.lang.String controleCliente;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CampoAdicional[] camposAdicionais;

    public CriarPreSolicitacaoRequest() {
    }

    public CriarPreSolicitacaoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef solicitante,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef passageiro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef[] acompanhantes,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.PedidoAereo[] pedidosAereos,
           br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.PedidoHotel[] pedidosHoteis,
           br.com.lemontech.selfbooking.wsselfbooking.beans.carro.PedidoCarro[] pedidosCarros,
           java.lang.String controleCliente,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CampoAdicional[] camposAdicionais) {
           this.solicitante = solicitante;
           this.passageiro = passageiro;
           this.acompanhantes = acompanhantes;
           this.centroDeCustoRef = centroDeCustoRef;
           this.pedidosAereos = pedidosAereos;
           this.pedidosHoteis = pedidosHoteis;
           this.pedidosCarros = pedidosCarros;
           this.controleCliente = controleCliente;
           this.camposAdicionais = camposAdicionais;
    }


    /**
     * Gets the solicitante value for this CriarPreSolicitacaoRequest.
     * 
     * @return solicitante
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getSolicitante() {
        return solicitante;
    }


    /**
     * Sets the solicitante value for this CriarPreSolicitacaoRequest.
     * 
     * @param solicitante
     */
    public void setSolicitante(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef solicitante) {
        this.solicitante = solicitante;
    }


    /**
     * Gets the passageiro value for this CriarPreSolicitacaoRequest.
     * 
     * @return passageiro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getPassageiro() {
        return passageiro;
    }


    /**
     * Sets the passageiro value for this CriarPreSolicitacaoRequest.
     * 
     * @param passageiro
     */
    public void setPassageiro(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef passageiro) {
        this.passageiro = passageiro;
    }


    /**
     * Gets the acompanhantes value for this CriarPreSolicitacaoRequest.
     * 
     * @return acompanhantes
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef[] getAcompanhantes() {
        return acompanhantes;
    }


    /**
     * Sets the acompanhantes value for this CriarPreSolicitacaoRequest.
     * 
     * @param acompanhantes
     */
    public void setAcompanhantes(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef[] acompanhantes) {
        this.acompanhantes = acompanhantes;
    }


    /**
     * Gets the centroDeCustoRef value for this CriarPreSolicitacaoRequest.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this CriarPreSolicitacaoRequest.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the pedidosAereos value for this CriarPreSolicitacaoRequest.
     * 
     * @return pedidosAereos
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.PedidoAereo[] getPedidosAereos() {
        return pedidosAereos;
    }


    /**
     * Sets the pedidosAereos value for this CriarPreSolicitacaoRequest.
     * 
     * @param pedidosAereos
     */
    public void setPedidosAereos(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.PedidoAereo[] pedidosAereos) {
        this.pedidosAereos = pedidosAereos;
    }


    /**
     * Gets the pedidosHoteis value for this CriarPreSolicitacaoRequest.
     * 
     * @return pedidosHoteis
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.PedidoHotel[] getPedidosHoteis() {
        return pedidosHoteis;
    }


    /**
     * Sets the pedidosHoteis value for this CriarPreSolicitacaoRequest.
     * 
     * @param pedidosHoteis
     */
    public void setPedidosHoteis(br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.PedidoHotel[] pedidosHoteis) {
        this.pedidosHoteis = pedidosHoteis;
    }


    /**
     * Gets the pedidosCarros value for this CriarPreSolicitacaoRequest.
     * 
     * @return pedidosCarros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.carro.PedidoCarro[] getPedidosCarros() {
        return pedidosCarros;
    }


    /**
     * Sets the pedidosCarros value for this CriarPreSolicitacaoRequest.
     * 
     * @param pedidosCarros
     */
    public void setPedidosCarros(br.com.lemontech.selfbooking.wsselfbooking.beans.carro.PedidoCarro[] pedidosCarros) {
        this.pedidosCarros = pedidosCarros;
    }


    /**
     * Gets the controleCliente value for this CriarPreSolicitacaoRequest.
     * 
     * @return controleCliente
     */
    public java.lang.String getControleCliente() {
        return controleCliente;
    }


    /**
     * Sets the controleCliente value for this CriarPreSolicitacaoRequest.
     * 
     * @param controleCliente
     */
    public void setControleCliente(java.lang.String controleCliente) {
        this.controleCliente = controleCliente;
    }


    /**
     * Gets the camposAdicionais value for this CriarPreSolicitacaoRequest.
     * 
     * @return camposAdicionais
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CampoAdicional[] getCamposAdicionais() {
        return camposAdicionais;
    }


    /**
     * Sets the camposAdicionais value for this CriarPreSolicitacaoRequest.
     * 
     * @param camposAdicionais
     */
    public void setCamposAdicionais(br.com.lemontech.selfbooking.wsselfbooking.beans.CampoAdicional[] camposAdicionais) {
        this.camposAdicionais = camposAdicionais;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarPreSolicitacaoRequest)) return false;
        CriarPreSolicitacaoRequest other = (CriarPreSolicitacaoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solicitante==null && other.getSolicitante()==null) || 
             (this.solicitante!=null &&
              this.solicitante.equals(other.getSolicitante()))) &&
            ((this.passageiro==null && other.getPassageiro()==null) || 
             (this.passageiro!=null &&
              this.passageiro.equals(other.getPassageiro()))) &&
            ((this.acompanhantes==null && other.getAcompanhantes()==null) || 
             (this.acompanhantes!=null &&
              java.util.Arrays.equals(this.acompanhantes, other.getAcompanhantes()))) &&
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef()))) &&
            ((this.pedidosAereos==null && other.getPedidosAereos()==null) || 
             (this.pedidosAereos!=null &&
              java.util.Arrays.equals(this.pedidosAereos, other.getPedidosAereos()))) &&
            ((this.pedidosHoteis==null && other.getPedidosHoteis()==null) || 
             (this.pedidosHoteis!=null &&
              java.util.Arrays.equals(this.pedidosHoteis, other.getPedidosHoteis()))) &&
            ((this.pedidosCarros==null && other.getPedidosCarros()==null) || 
             (this.pedidosCarros!=null &&
              java.util.Arrays.equals(this.pedidosCarros, other.getPedidosCarros()))) &&
            ((this.controleCliente==null && other.getControleCliente()==null) || 
             (this.controleCliente!=null &&
              this.controleCliente.equals(other.getControleCliente()))) &&
            ((this.camposAdicionais==null && other.getCamposAdicionais()==null) || 
             (this.camposAdicionais!=null &&
              java.util.Arrays.equals(this.camposAdicionais, other.getCamposAdicionais())));
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
        if (getSolicitante() != null) {
            _hashCode += getSolicitante().hashCode();
        }
        if (getPassageiro() != null) {
            _hashCode += getPassageiro().hashCode();
        }
        if (getAcompanhantes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcompanhantes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcompanhantes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        if (getPedidosAereos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPedidosAereos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPedidosAereos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPedidosHoteis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPedidosHoteis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPedidosHoteis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPedidosCarros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPedidosCarros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPedidosCarros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getControleCliente() != null) {
            _hashCode += getControleCliente().hashCode();
        }
        if (getCamposAdicionais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCamposAdicionais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCamposAdicionais(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriarPreSolicitacaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "criarPreSolicitacaoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passageiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passageiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acompanhantes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acompanhantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "passageiro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedidosAereos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pedidosAereos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "pedidoAereo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pedidoAereo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedidosHoteis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pedidosHoteis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "pedidoHotel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pedidoHotel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedidosCarros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pedidosCarros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "pedidoCarro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pedidoCarro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controleCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controleCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camposAdicionais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "camposAdicionais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "campoAdicional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "campoAdicional"));
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
