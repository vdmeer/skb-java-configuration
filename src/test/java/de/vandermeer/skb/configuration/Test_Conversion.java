package de.vandermeer.skb.configuration;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.CommonToken;
import org.apache.commons.lang3.text.StrBuilder;
import org.junit.Test;

import de.vandermeer.skb.base.Skb_Renderable;
import de.vandermeer.skb.base.Skb_Transformer;
import de.vandermeer.skb.base.utils.Skb_Antlr4Utils;
import de.vandermeer.skb.base.utils.Skb_TextUtils;
import de.vandermeer.skb.categories.CategoryWithValue;

public class Test_Conversion {

	@SuppressWarnings("unchecked")
	@Test public void test_Manyobjects2Strbuilder(){
		Skb_Transformer<Object, String> toText=Skb_Transformer.CHAIN(Skb_Antlr4Utils.ANTLR_TO_TEXT(), CategoryWithValue.CAT_TO_VALUESTRING(), Skb_Renderable.OBJECT_TO_RENDERABLE_VALUE(), Skb_TextUtils.TO_STRING());

		Skb_Transformer<Object, StrBuilder> tf=Skb_TextUtils.MANYOBJECTS_TO_STRBUILDER("++", toText);
		List<Object> list=new ArrayList<>();

		assertEquals("", tf.transform((Iterator<Object>)null).toString());
		assertEquals("", tf.transform(list.iterator()).toString());

		CommonToken tk=new CommonToken(0);
		tk.setText("token1");
		list.add(tk);
		assertEquals("token1", tf.transform(list.iterator()).toString());

		list.add(3.1415);
		assertEquals("token1++3.1415", tf.transform(list.iterator()).toString());

		list.add(EAttributeKeys.VALUE_CLI);
		list.add(EPath.ROOT);
		assertEquals("token1++3.1415++value.cli++/", tf.transform(list.iterator()).toString());
		//TODO doesn't test HasValue/IsValue yet
	}
}
