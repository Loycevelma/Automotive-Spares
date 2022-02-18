package com.example.automotiveapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.automotiveapp.Buyer.ActivityBuyerProducts
import com.example.automotiveapp.Buyer.ActivityBuyerViewCart
import com.example.automotiveapp.R
import com.example.automotiveapp.models.Orders
import com.google.android.gms.analytics.ecommerce.Product
import com.squareup.picasso.Picasso

class RvBuyerProductsActivity (var productList: List<Orders>, var context: Context, var productClickListener: ActivityBuyerProducts.ProductClickListener): RecyclerView.Adapter<CartProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartProductViewHolder { var itemView= LayoutInflater.from(parent.context).inflate(R.layout.layout_cart_item,parent,false)
        return CartProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartProductViewHolder, position: Int) {
        val currentOrders = productList.get(position)
        holder.tvProductName.text= currentOrders.ProductName
        holder.tvDescription.text=currentOrders.Description
        holder.tvPrices.text=currentOrders.Prices

        Picasso.get()
            .load(currentOrders.ImageUrl)
            .resize(100, 100)
            .into(holder.imgProduct)
//
        holder.cvProduct.setOnClickListener {
            var intent= Intent(context, ActivityBuyerViewCart::class.java)
            intent.putExtra("ProductName",currentOrders.ProductName)
            intent.putExtra("Description",currentOrders.Description)
            intent.putExtra("Price",currentOrders.Prices)
            intent.putExtra("ImageUrl",currentOrders.ImageUrl)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent)
        }


        holder.ivplus.setOnClickListener {
            productClickListener.onSelectedProduct(currentOrders)
        }

        holder.ivMinus.setOnClickListener {
            productClickListener.onSelectedProduct(currentOrders)
        }

        holder.ivDelete.setOnClickListener {
            productClickListener.onDeleteProduct(currentOrders)
        }


    }
    override fun getItemCount(): Int {
        return productList.size
    }
}

class CartProductViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
    var imgProduct=itemView.findViewById<ImageView>(R.id.imgProduct)
    var tvProductName=itemView.findViewById<TextView>(R.id.tvProductName)
    var tvDescription=itemView.findViewById<TextView>(R.id.tvDescription)
    var tvPrices=itemView.findViewById<TextView>(R.id.tvPrices)
    var ivplus= itemView.findViewById<ImageView>(R.id.ivPlus)
    var ivMinus= itemView.findViewById<ImageView>(R.id.ivMinus)
    var ivDelete= itemView.findViewById<ImageView>(R.id.ivDelete)
    var cvProduct= itemView.findViewById<CardView>(R.id.cvProduct)

}
