package unipe.br.mlpiii.pwc.modelo;

public class Item implements Comparable <Item> {
	protected int codigo;
	protected String descricao;
	protected double preço;
	
public Item(int codigo, double preço, String descricao){
	this.codigo = codigo;
	this.preço = preço;
	this.descricao = descricao;
}
public Item(){

}
public int compareTo(Item outra)	{
if	(this.codigo <	outra.codigo)	{
return	-1;
}
if	(this.codigo >	outra.codigo)	{
return	1;
}
return	0;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getPreço() {
	return preço;
}
public void setPreço(double preço) {
	this.preço = preço;
}
public String toString() {
	return this.codigo+","+this.descricao;
}



}

