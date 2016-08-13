package net.yeah.zhouyou.mickey.mysql.tree;

public class TableNameAndAliasNode extends SQLSyntaxTreeNode {

	private String name;
	private String alias;

	public TableNameAndAliasNode(String name, String alias) {
		this.name = name;
		this.alias = alias;
	}

	@Override
	public String toString() {
		if (alias != null)
			return name + ' ' + alias;
		else
			return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}