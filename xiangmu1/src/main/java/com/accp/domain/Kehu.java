package com.accp.domain;

public class Kehu {
    private Integer id;

    private String name;

    private String lianxir;

    private String tdata;

    private String lianxid;

    private String fuzer;

    private String denjihao;
    
    private Dizhi dizhi;
    
    public Dizhi getDizhi() {
		return dizhi;
	}
    
    public void setDizhi(Dizhi dizhi) {
		this.dizhi = dizhi;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLianxir() {
        return lianxir;
    }

    public void setLianxir(String lianxir) {
        this.lianxir = lianxir;
    }

    public String getTdata() {
        return tdata;
    }

    public void setTdata(String tdata) {
        this.tdata = tdata;
    }

    public String getLianxid() {
        return lianxid;
    }

    public void setLianxid(String lianxid) {
        this.lianxid = lianxid;
    }

    public String getFuzer() {
        return fuzer;
    }

    public void setFuzer(String fuzer) {
        this.fuzer = fuzer;
    }

    public String getDenjihao() {
        return denjihao;
    }

    public void setDenjihao(String denjihao) {
        this.denjihao = denjihao;
    }
}