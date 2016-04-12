package unipe.br.mlpiii.pwc.modelo;

public class Item implements Comparable <Item> {
	protected int codigo;
	protected String descricao;
	protected double pre�o;
	
public Item(int codigo, double pre�o, String descricao){
	this.codigo = codigo;
	this.pre�o = pre�o;
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
public double getPre�o() {
	return pre�o;
}
public void setPre�o(double pre�o) {
	this.pre�o = pre�o;
}
public String toString() {
	return this.codigo+","+this.descricao;
}



}

