package models;


public class GemTree {

	private BinarySearchTree<Long, Gem> gemTree;
	int counter = 1;

	private GemTree() {
		LongComparator comp = new LongComparator();
		this.gemTree = new BSTImp<Long, Gem>(comp);
	}

	public Gem addGem(Gem obj) {
		long id = this.counter++;
		obj.setId(id);
		this.gemTree.add(id, obj);
		return obj;
	}

	public Gem[] getGemById(long id) {
		Gem[] result = new Gem[1];
		result[0] = this.gemTree.get(id);
		return result;
	}

	public Gem[] getAllGems() {
		Gem result[] = new Gem[this.gemTree.size()];
		int i = 0;
		for (Gem G : gemTree) {
			result[i++] = G;
		}
		return result;
	}

	public boolean deleteGem(long id) {
		return this.gemTree.remove(id) != null;
	}

	public Gem updateGem(Gem obj) {
		Gem G = this.gemTree.get(obj.getId());
		// A gem exists by that id
		if (G != null) {
			G.setName(obj.getName());
			G.setDescription(obj.getDescription());
			G.setPrice(obj.getPrice());
			G.setRarity(obj.getRarity());
			G.setShine(obj.getShine());
			G.setFaces(obj.getFaces());
			G.setColor(obj.getColor());
			for(int i=0;i<obj.getReviews().size();i++){
				obj.getReviews().get(i).setId(G.getId());
			}
			G.setReviews(obj.getReviews());
			
		}
		return G;
	}

	private static GemTree singleton = new GemTree();

	public static GemTree getInstance() {
		return singleton;
	}
}
