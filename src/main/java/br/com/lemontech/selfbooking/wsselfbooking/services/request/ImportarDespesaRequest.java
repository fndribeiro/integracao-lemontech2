/**
 * ImportarDespesaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class ImportarDespesaRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario;

    private java.util.Calendar dataTransacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private double valorTransacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaOriginal;

    private java.lang.Double valorTransacaoOriginal;

    private java.lang.String estabelecimento;

    private java.lang.String codigoAutorizacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.QualificadorDespesa qualificadorDespesa;

    private java.lang.String enderecoPartida;

    private org.apache.axis.types.Time horaPartida;

    private java.lang.String enderecoChegada;

    private org.apache.axis.types.Time horaChegada;

    private java.lang.Double distancia;

    private java.util.Date dataContabil;

    private java.lang.String codigoCartao;

    private java.lang.String cidade;

    private java.lang.String paisOrigem;

    private java.lang.Long numeroIdentificador;

    public ImportarDespesaRequest() {
    }

    public ImportarDespesaRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario,
           java.util.Calendar dataTransacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           double valorTransacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaOriginal,
           java.lang.Double valorTransacaoOriginal,
           java.lang.String estabelecimento,
           java.lang.String codigoAutorizacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.QualificadorDespesa qualificadorDespesa,
           java.lang.String enderecoPartida,
           org.apache.axis.types.Time horaPartida,
           java.lang.String enderecoChegada,
           org.apache.axis.types.Time horaChegada,
           java.lang.Double distancia,
           java.util.Date dataContabil,
           java.lang.String codigoCartao,
           java.lang.String cidade,
           java.lang.String paisOrigem,
           java.lang.Long numeroIdentificador) {
           this.funcionario = funcionario;
           this.dataTransacao = dataTransacao;
           this.moeda = moeda;
           this.valorTransacao = valorTransacao;
           this.moedaOriginal = moedaOriginal;
           this.valorTransacaoOriginal = valorTransacaoOriginal;
           this.estabelecimento = estabelecimento;
           this.codigoAutorizacao = codigoAutorizacao;
           this.qualificadorDespesa = qualificadorDespesa;
           this.enderecoPartida = enderecoPartida;
           this.horaPartida = horaPartida;
           this.enderecoChegada = enderecoChegada;
           this.horaChegada = horaChegada;
           this.distancia = distancia;
           this.dataContabil = dataContabil;
           this.codigoCartao = codigoCartao;
           this.cidade = cidade;
           this.paisOrigem = paisOrigem;
           this.numeroIdentificador = numeroIdentificador;
    }


    /**
     * Gets the funcionario value for this ImportarDespesaRequest.
     * 
     * @return funcionario
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this ImportarDespesaRequest.
     * 
     * @param funcionario
     */
    public void setFuncionario(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario) {
        this.funcionario = funcionario;
    }


    /**
     * Gets the dataTransacao value for this ImportarDespesaRequest.
     * 
     * @return dataTransacao
     */
    public java.util.Calendar getDataTransacao() {
        return dataTransacao;
    }


    /**
     * Sets the dataTransacao value for this ImportarDespesaRequest.
     * 
     * @param dataTransacao
     */
    public void setDataTransacao(java.util.Calendar dataTransacao) {
        this.dataTransacao = dataTransacao;
    }


    /**
     * Gets the moeda value for this ImportarDespesaRequest.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this ImportarDespesaRequest.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the valorTransacao value for this ImportarDespesaRequest.
     * 
     * @return valorTransacao
     */
    public double getValorTransacao() {
        return valorTransacao;
    }


    /**
     * Sets the valorTransacao value for this ImportarDespesaRequest.
     * 
     * @param valorTransacao
     */
    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }


    /**
     * Gets the moedaOriginal value for this ImportarDespesaRequest.
     * 
     * @return moedaOriginal
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoedaOriginal() {
        return moedaOriginal;
    }


    /**
     * Sets the moedaOriginal value for this ImportarDespesaRequest.
     * 
     * @param moedaOriginal
     */
    public void setMoedaOriginal(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moedaOriginal) {
        this.moedaOriginal = moedaOriginal;
    }


    /**
     * Gets the valorTransacaoOriginal value for this ImportarDespesaRequest.
     * 
     * @return valorTransacaoOriginal
     */
    public java.lang.Double getValorTransacaoOriginal() {
        return valorTransacaoOriginal;
    }


    /**
     * Sets the valorTransacaoOriginal value for this ImportarDespesaRequest.
     * 
     * @param valorTransacaoOriginal
     */
    public void setValorTransacaoOriginal(java.lang.Double valorTransacaoOriginal) {
        this.valorTransacaoOriginal = valorTransacaoOriginal;
    }


    /**
     * Gets the estabelecimento value for this ImportarDespesaRequest.
     * 
     * @return estabelecimento
     */
    public java.lang.String getEstabelecimento() {
        return estabelecimento;
    }


    /**
     * Sets the estabelecimento value for this ImportarDespesaRequest.
     * 
     * @param estabelecimento
     */
    public void setEstabelecimento(java.lang.String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }


    /**
     * Gets the codigoAutorizacao value for this ImportarDespesaRequest.
     * 
     * @return codigoAutorizacao
     */
    public java.lang.String getCodigoAutorizacao() {
        return codigoAutorizacao;
    }


    /**
     * Sets the codigoAutorizacao value for this ImportarDespesaRequest.
     * 
     * @param codigoAutorizacao
     */
    public void setCodigoAutorizacao(java.lang.String codigoAutorizacao) {
        this.codigoAutorizacao = codigoAutorizacao;
    }


    /**
     * Gets the qualificadorDespesa value for this ImportarDespesaRequest.
     * 
     * @return qualificadorDespesa
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.QualificadorDespesa getQualificadorDespesa() {
        return qualificadorDespesa;
    }


    /**
     * Sets the qualificadorDespesa value for this ImportarDespesaRequest.
     * 
     * @param qualificadorDespesa
     */
    public void setQualificadorDespesa(br.com.lemontech.selfbooking.wsselfbooking.beans.types.QualificadorDespesa qualificadorDespesa) {
        this.qualificadorDespesa = qualificadorDespesa;
    }


    /**
     * Gets the enderecoPartida value for this ImportarDespesaRequest.
     * 
     * @return enderecoPartida
     */
    public java.lang.String getEnderecoPartida() {
        return enderecoPartida;
    }


    /**
     * Sets the enderecoPartida value for this ImportarDespesaRequest.
     * 
     * @param enderecoPartida
     */
    public void setEnderecoPartida(java.lang.String enderecoPartida) {
        this.enderecoPartida = enderecoPartida;
    }


    /**
     * Gets the horaPartida value for this ImportarDespesaRequest.
     * 
     * @return horaPartida
     */
    public org.apache.axis.types.Time getHoraPartida() {
        return horaPartida;
    }


    /**
     * Sets the horaPartida value for this ImportarDespesaRequest.
     * 
     * @param horaPartida
     */
    public void setHoraPartida(org.apache.axis.types.Time horaPartida) {
        this.horaPartida = horaPartida;
    }


    /**
     * Gets the enderecoChegada value for this ImportarDespesaRequest.
     * 
     * @return enderecoChegada
     */
    public java.lang.String getEnderecoChegada() {
        return enderecoChegada;
    }


    /**
     * Sets the enderecoChegada value for this ImportarDespesaRequest.
     * 
     * @param enderecoChegada
     */
    public void setEnderecoChegada(java.lang.String enderecoChegada) {
        this.enderecoChegada = enderecoChegada;
    }


    /**
     * Gets the horaChegada value for this ImportarDespesaRequest.
     * 
     * @return horaChegada
     */
    public org.apache.axis.types.Time getHoraChegada() {
        return horaChegada;
    }


    /**
     * Sets the horaChegada value for this ImportarDespesaRequest.
     * 
     * @param horaChegada
     */
    public void setHoraChegada(org.apache.axis.types.Time horaChegada) {
        this.horaChegada = horaChegada;
    }


    /**
     * Gets the distancia value for this ImportarDespesaRequest.
     * 
     * @return distancia
     */
    public java.lang.Double getDistancia() {
        return distancia;
    }


    /**
     * Sets the distancia value for this ImportarDespesaRequest.
     * 
     * @param distancia
     */
    public void setDistancia(java.lang.Double distancia) {
        this.distancia = distancia;
    }


    /**
     * Gets the dataContabil value for this ImportarDespesaRequest.
     * 
     * @return dataContabil
     */
    public java.util.Date getDataContabil() {
        return dataContabil;
    }


    /**
     * Sets the dataContabil value for this ImportarDespesaRequest.
     * 
     * @param dataContabil
     */
    public void setDataContabil(java.util.Date dataContabil) {
        this.dataContabil = dataContabil;
    }


    /**
     * Gets the codigoCartao value for this ImportarDespesaRequest.
     * 
     * @return codigoCartao
     */
    public java.lang.String getCodigoCartao() {
        return codigoCartao;
    }


    /**
     * Sets the codigoCartao value for this ImportarDespesaRequest.
     * 
     * @param codigoCartao
     */
    public void setCodigoCartao(java.lang.String codigoCartao) {
        this.codigoCartao = codigoCartao;
    }


    /**
     * Gets the cidade value for this ImportarDespesaRequest.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ImportarDespesaRequest.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the paisOrigem value for this ImportarDespesaRequest.
     * 
     * @return paisOrigem
     */
    public java.lang.String getPaisOrigem() {
        return paisOrigem;
    }


    /**
     * Sets the paisOrigem value for this ImportarDespesaRequest.
     * 
     * @param paisOrigem
     */
    public void setPaisOrigem(java.lang.String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    /**
     * Gets the numeroIdentificador value for this ImportarDespesaRequest.
     * 
     * @return numeroIdentificador
     */
    public java.lang.Long getNumeroIdentificador() {
        return numeroIdentificador;
    }


    /**
     * Sets the numeroIdentificador value for this ImportarDespesaRequest.
     * 
     * @param numeroIdentificador
     */
    public void setNumeroIdentificador(java.lang.Long numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportarDespesaRequest)) return false;
        ImportarDespesaRequest other = (ImportarDespesaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario()))) &&
            ((this.dataTransacao==null && other.getDataTransacao()==null) || 
             (this.dataTransacao!=null &&
              this.dataTransacao.equals(other.getDataTransacao()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            this.valorTransacao == other.getValorTransacao() &&
            ((this.moedaOriginal==null && other.getMoedaOriginal()==null) || 
             (this.moedaOriginal!=null &&
              this.moedaOriginal.equals(other.getMoedaOriginal()))) &&
            ((this.valorTransacaoOriginal==null && other.getValorTransacaoOriginal()==null) || 
             (this.valorTransacaoOriginal!=null &&
              this.valorTransacaoOriginal.equals(other.getValorTransacaoOriginal()))) &&
            ((this.estabelecimento==null && other.getEstabelecimento()==null) || 
             (this.estabelecimento!=null &&
              this.estabelecimento.equals(other.getEstabelecimento()))) &&
            ((this.codigoAutorizacao==null && other.getCodigoAutorizacao()==null) || 
             (this.codigoAutorizacao!=null &&
              this.codigoAutorizacao.equals(other.getCodigoAutorizacao()))) &&
            ((this.qualificadorDespesa==null && other.getQualificadorDespesa()==null) || 
             (this.qualificadorDespesa!=null &&
              this.qualificadorDespesa.equals(other.getQualificadorDespesa()))) &&
            ((this.enderecoPartida==null && other.getEnderecoPartida()==null) || 
             (this.enderecoPartida!=null &&
              this.enderecoPartida.equals(other.getEnderecoPartida()))) &&
            ((this.horaPartida==null && other.getHoraPartida()==null) || 
             (this.horaPartida!=null &&
              this.horaPartida.equals(other.getHoraPartida()))) &&
            ((this.enderecoChegada==null && other.getEnderecoChegada()==null) || 
             (this.enderecoChegada!=null &&
              this.enderecoChegada.equals(other.getEnderecoChegada()))) &&
            ((this.horaChegada==null && other.getHoraChegada()==null) || 
             (this.horaChegada!=null &&
              this.horaChegada.equals(other.getHoraChegada()))) &&
            ((this.distancia==null && other.getDistancia()==null) || 
             (this.distancia!=null &&
              this.distancia.equals(other.getDistancia()))) &&
            ((this.dataContabil==null && other.getDataContabil()==null) || 
             (this.dataContabil!=null &&
              this.dataContabil.equals(other.getDataContabil()))) &&
            ((this.codigoCartao==null && other.getCodigoCartao()==null) || 
             (this.codigoCartao!=null &&
              this.codigoCartao.equals(other.getCodigoCartao()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.paisOrigem==null && other.getPaisOrigem()==null) || 
             (this.paisOrigem!=null &&
              this.paisOrigem.equals(other.getPaisOrigem()))) &&
            ((this.numeroIdentificador==null && other.getNumeroIdentificador()==null) || 
             (this.numeroIdentificador!=null &&
              this.numeroIdentificador.equals(other.getNumeroIdentificador())));
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
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        if (getDataTransacao() != null) {
            _hashCode += getDataTransacao().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        _hashCode += new Double(getValorTransacao()).hashCode();
        if (getMoedaOriginal() != null) {
            _hashCode += getMoedaOriginal().hashCode();
        }
        if (getValorTransacaoOriginal() != null) {
            _hashCode += getValorTransacaoOriginal().hashCode();
        }
        if (getEstabelecimento() != null) {
            _hashCode += getEstabelecimento().hashCode();
        }
        if (getCodigoAutorizacao() != null) {
            _hashCode += getCodigoAutorizacao().hashCode();
        }
        if (getQualificadorDespesa() != null) {
            _hashCode += getQualificadorDespesa().hashCode();
        }
        if (getEnderecoPartida() != null) {
            _hashCode += getEnderecoPartida().hashCode();
        }
        if (getHoraPartida() != null) {
            _hashCode += getHoraPartida().hashCode();
        }
        if (getEnderecoChegada() != null) {
            _hashCode += getEnderecoChegada().hashCode();
        }
        if (getHoraChegada() != null) {
            _hashCode += getHoraChegada().hashCode();
        }
        if (getDistancia() != null) {
            _hashCode += getDistancia().hashCode();
        }
        if (getDataContabil() != null) {
            _hashCode += getDataContabil().hashCode();
        }
        if (getCodigoCartao() != null) {
            _hashCode += getCodigoCartao().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getPaisOrigem() != null) {
            _hashCode += getPaisOrigem().hashCode();
        }
        if (getNumeroIdentificador() != null) {
            _hashCode += getNumeroIdentificador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportarDespesaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "importarDespesaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moedaOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moedaOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTransacaoOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTransacaoOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estabelecimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estabelecimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAutorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAutorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificadorDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qualificadorDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "qualificadorDespesa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoPartida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enderecoPartida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaPartida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaPartida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoChegada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enderecoChegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaChegada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaChegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distancia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataContabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataContabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCartao"));
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
        elemField.setFieldName("paisOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroIdentificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
