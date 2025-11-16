package com.example.rest_api_app

import android.provider.MediaStore
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private val products: List<Product>) :
   RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ProductViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
    return products.size
    }

    inner class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val productName = itemView.findViewById<TextView>(R.id.nameTex)
        private val productPrice = itemView.findViewById<TextView>(R.id.textView3)

        fun bind(product: Product){
           Glide.with(itemView)
               .load(product.images[0])
               .into(productImage)
            productName.text = product.title
            productPrice.text = "$${product.price}"
        }


    }



}
