/*package com.example.KnowYouLimit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class BeerAdapter(private val context: Context,
                             private val dataSource: ArrayList<Beer>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.activity_beer, parent, false)

        val titleTextView = rowView.findViewById(R.id.beer_list_title) as TextView

        val detailTextView = rowView.findViewById(R.id.beer_list_detail) as TextView

        val thumbnailImageView = rowView.findViewById(R.id.beer_list_thumbnail) as ImageView

        // 1
        val recipe = getItem(position) as Beer

        titleTextView.text = recipe.title
        detailTextView.text = recipe.label

        Picasso.with(context).load(recipe.imageUrl).placeholder(R.mipmap.ic_launcher).into(thumbnailImageView)

        return rowView
    }

}
*/