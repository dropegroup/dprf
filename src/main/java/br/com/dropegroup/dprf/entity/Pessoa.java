package br.com.dropegroup.dprf.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "pessoa")
public class Pessoa {

	@Id
	@Column(name = "pesid")
	private Integer pesid;

	@Column(name = "pesexpedidor", length = 10)
	private String pesexpedidor;

	@Column(name = "pesufexpedidora", length = 2)
	private String pesufexpedidora;

	@Column(name = "pesdatanascimento")
	private Date pesdatanascimento;

	@Column(name = "pesnaturalidade", length = 5)
	private String pesnaturalidade;

	@Column(name = "pesnacionalidade")
	private Integer pesnacionalidade;

	@Column(name = "pessexo", length = 1)
	private String pessexo;

	@Column(name = "pesteccodigo")
	private Integer pesteccodigo;

	@Column(name = "pestgicodigo")
	private Integer pestgicodigo;

	@Column(name = "pesmunicipio", length = 5)
	private String pesmunicipio;

	@Column(name = "pestopcodigo")
	private Integer pestopcodigo;

	@Column(name = "pesmunicipioori", length = 5)
	private String pesmunicipioori;

	@Column(name = "pespaisori")
	private Integer pespaisori;

	@Column(name = "pesmunicipiodest", length = 5)
	private String pesmunicipiodest;

	@Column(name = "pespaisdest")
	private Integer pespaisdest;

	@Column(name = "pesveiid")
	private Integer pesveiid;

	@Column(name = "pesestadofisico")
	private Integer pesestadofisico;

	@Column(name = "pescinto", length = 1)
	private String pescinto;

	@Column(name = "pescapacete", length = 1)
	private String pescapacete;

	@Column(name = "peshabilitado", length = 1)
	private String peshabilitado;

	@Column(name = "pessocorrido", length = 1)
	private String pessocorrido;

	@Column(name = "pesdormindo", length = 1)
	private String pesdormindo;

	@Column(name = "pesalcool", length = 1)
	private String pesalcool;

	@Column(name = "peskmpercorre")
	private Integer peskmpercorre;

	@Column(name = "peshorapercorre", length = 4)
	private String peshorapercorre;

	@Column(name = "pescategcnh", length = 3)
	private String pescategcnh;

	@Column(name = "pesregistrocnh", length = 11)
	private String pesregistrocnh;

	@Column(name = "pesufcnh", length = 2)
	private String pesufcnh;

	@Column(name = "pespaiscnh")
	private Integer pespaiscnh;

	@Column(name = "pesdatahabil")
	private Date pesdatahabil;

	@Column(name = "pesdatavalidade")
	private Date pesdatavalidade;

	@Column(name = "pesapelido", length = 30)
	private String pesapelido;

	@Column(name = "pesidade")
	private Integer pesidade;

	@Column(name = "pesaltura")
	private Integer pesaltura;

	@Column(name = "pespeso")
	private Integer pespeso;

	@Column(name = "pescicatriz", length = 1)
	private String pescicatriz;

	@Column(name = "pestatuagem", length = 1)
	private String pestatuagem;

	@Column(name = "pessinal", length = 1)
	private String pessinal;

	@Column(name = "peslesao", length = 1)
	private String peslesao;

	@Column(name = "pestcccodigo")
	private Integer pestcccodigo;

	@Column(name = "pestctcodigo")
	private Integer pestctcodigo;

	@Column(name = "pestclcodigo")
	private Integer pestclcodigo;

	@Column(name = "pespertences")
	private String pespertences;

	@Column(name = "pesdadoscomplement")
	private String pesdadoscomplement;

	@Column(name = "pesoenid")
	private Integer pesoenid;

}
