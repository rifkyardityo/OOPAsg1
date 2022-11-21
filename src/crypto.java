
public class crypto {
String initial;
String name;
String type;
Double price;
Double quantity;
int idx;
int total;
public crypto(String initial, String name, String type, Double price, Double quantity, int idx, int total) {
	super();
	this.initial = initial;
	this.name = name;
	this.type = type;
	this.price = price;
	this.quantity = quantity;
	this.idx = idx;
	this.total = total;
}
public String getInitial() {
	return initial;
}
public void setInitial(String initial) {
	this.initial = initial;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Double getQuantity() {
	return quantity;
}
public void setQuantity(Double quantity) {
	this.quantity = quantity;
}
public int getIdx() {
	return idx;
}
public void setIdx(int idx) {
	this.idx = idx;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
}