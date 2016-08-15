package net.yeah.zhouyou.mickey.mysql.tree;

public class ParamListNode extends SQLSyntaxTreeNode {

	private ElementNode param;
	private ParamListNode suffix;

	public ParamListNode(ElementNode param, ParamListNode suffix) {
		this.param = param;
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		if (suffix != null)
		return param.toString() + ',' + suffix;
		return param.toString();
	}

}
