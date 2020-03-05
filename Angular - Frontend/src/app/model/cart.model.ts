import { Book } from './book.model';
import { Injectable } from '@angular/core';
@Injectable()
export class Cart{
 
    public lines: CartLine[] = [];
    public itemCount: number = 0;
    public cartPrice: number = 0;
 
    addLine(product: Book, quantity: number=1){
        let line = this.lines.find(line => line.product.id == product.id);
 
        if(line!=undefined){
            line.quantity +=quantity;
        }
        else{
            this.lines.push(new CartLine(product,quantity));
        }
        this.recalculate();
    }
 
    updateQuantity(product: Book, quantity: number){
        let line = this.lines.find(line => line.product.id == product.id);
 
        if(line!=undefined){
            line.quantity = Number(quantity);
        }
        this.recalculate();
    }
 
    removeLine(id: number){
        let index = this.lines.findIndex(line => line.product.id == id);
        this.lines.splice(index,1);
        this.recalculate();
    }
 
    clear(){
        this.lines = [];
        this.itemCount = 0;
        this.cartPrice = 0;
    }
 
    private recalculate(){
        this.itemCount=0;
        this.cartPrice=0;
        this.lines.forEach(l => {
            this.itemCount += l.quantity;
            this.cartPrice += (l.quantity * l.product.price);
        }) //for each cartline l in array
    }
 
}
 
export class CartLine{
 
    constructor(public product: Book,public quantity: number){}

    get lineTotal(){
        return this.quantity * this.product.price;
    }
}