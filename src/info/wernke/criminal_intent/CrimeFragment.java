package info.wernke.criminal_intent;


import android.os.*;
import android.support.v4.app.*;
import android.text.*;
import android.view.*;
import android.widget.*;

public class CrimeFragment extends Fragment
{
	private Crime mCrime;
	private EditText mTitleField;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		mCrime = new Crime();
		
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
	{
		View v = inflater.inflate(R.layout.crime_fragment,
		parent, false);
		
		
		mTitleField=(EditText)v.findViewById(R.id.crime_title);
		
		mTitleField.addTextChangedListener(new TextWatcher(){
			
			public void onTextChanged(CharSequence c, int start, int before, int count){
				mCrime.setTitle(c.toString());
			}
			
			public void beforeTextChanged(CharSequence c, int start, int count, int after){
				
			}
			
			
			public void afterTextChanged(Editable c){
				
			}
		});
		
		return v;
	}
	
	
	
}
