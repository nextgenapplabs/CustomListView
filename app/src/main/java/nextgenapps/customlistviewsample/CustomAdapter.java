package nextgenapps.customlistviewsample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apple on 30/01/17.
 */
public class CustomAdapter extends ArrayAdapter<Apps> {

    private Context context;

    public CustomAdapter(Context context, int single_row, List<Apps> data) {
        super(context, single_row, data);
        this.context = context;
    }

    //We will follw view holder pattern for better performance
    //I have already written code i ll copy paste

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        Apps row = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.single_row, null);
            holder = new ViewHolder();
            holder.appName = (TextView) convertView.findViewById(R.id.appName);
            holder.appDesc = (TextView) convertView.findViewById(R.id.appDesc);
            holder.icon = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.appName.setText(row.getName());
        holder.appDesc.setText(row.getDescription());
        holder.icon.setImageResource(row.getImageID());

        return convertView;
    }

    private class ViewHolder {

        TextView appName;
        TextView appDesc;
        ImageView icon;


    }


}
