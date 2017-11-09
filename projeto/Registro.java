package projeto;

interface EntryRegistry {
	public void add(Entry e);
	public Entry get(long timestamp) throws NotFoundException;
	public String toString();
}

class NotFoundException extends Exception {
	public NotFoundException (String message) {
		super(message);
	}
}

public class Registro {
	/*
	 * The actual registry frontend.
	 * */
	private EntryRegistry registry;
	
	/*
	 * Use like this:
	 *  Registro registro = new Registro(new EntryList());
	 * */
	public Registro(EntryRegistry el) {
		registry = el;
	}
	
	/**
	 * Add something to the registry
	 * 
	 * @param happened Something that happened.
	 * */
	public void add(String happened) {
		long timestamp = System.currentTimeMillis() / 1000L;
		Entry e = new Entry(timestamp, happened);
		registry.add(e);
	}
	
	/**
	 * Get something from the registry
	 * 
	 * @param timestamp
	 * @return entry object
	 * @throws NotFoundException
	 */
	public Entry get(long timestamp) throws NotFoundException {
		return registry.get(timestamp);
	}
	
	/**
	 * Get string representation of the list.
	 */
	public String toString() {
		return registry.toString();
	}
}

class Entry {
	/*
	 * Base class for entries in the registry.
	 * */
	private long timestamp;
	private String data;
	
	public Entry(long timestamp, String data) {
		this.timestamp = timestamp;
		this.data = data;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	public String getData() {
		return data;
	}

	public String toString() {
		return String.format("[timestamp: %d] %s\n", timestamp, data);
	}
}

class EntryList implements EntryRegistry {
	/*
	 * Main class for the actual registry.
	 * */
	private Entry value;
	private EntryList next;

	public EntryList() {
		this.value = null;
		this.next = null;
	}

	/**
	 * Add an entry to the registry 
	 * 
	 * @param v Entry to add to the registry
	 * */
	public void add(Entry v) {
		if (this.value == null) {
			this.value = v;
			this.next = new EntryList();
		} else {
			this.next.add(v);
		}
	}
	
	/**
	 * Get an entry from the registry
	 * 
	 * @param timestamp Timestamp to get an entry from.
	 */
	public Entry get(long timestamp) throws NotFoundException {
		if(this.value != null) {
			if(this.value.getTimestamp() == timestamp) {
				return this.value;
			} else {
				return this.next.get(timestamp);
			}
		} else {
			throw new NotFoundException("Elemento não encontrado");
		}
	}
	
	/**
	 * Get a string representation of the entire registry.
	 */
	public String toString() {
		if(this.next == null) {
			return "";
		}
		return this.value.toString() + "\n" + this.next.toString();
	}

	// We don't know how to compare the equality
	// of two entries (yet), so this will be commented out.
	/*
	public Entry remove(Entry v) {
		if (this.value != null) {
			if (this.value.getValor().equals(v.getValor())) {
				this.value = this.next.value;
				this.next = this.next.next;
				return v;
			} else {
				return this.next.remove(v);
			}
		} else {
			return null;
		}
	}

	public Entry search(Entry v) {
		if (this.value != null) {
			if (this.value.getValor().equals(v.getValor())) {
				return this.value;
			} else {
				return this.next.search(v);
			}
		} else {
			return null;
		}
	}
	
	*/
}

// TODO: add EntryArray
