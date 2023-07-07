package etu2055.framework;

import java.util.*;

public class ModelView {
	String url;
	HashMap<String,Object> data;
	HashMap<String, Object> session;
	boolean json = false;
	boolean invalidateSession = false;
	List<String> removeSession = new ArrayList<>();

	public void addToremove(String ...data){
		for (int i = 0; i < data.length; i++) {
			this.removeSession.add(data[i]);
		}
	}

	public void isInvalidateSession(boolean invalidateSession){
		this.invalidateSession = invalidateSession;
	}

	public void setRemoveSession(List<String> removeSession){
		this.removeSession = removeSession;
	}

	public List<String> getRemoveSession(){
		return removeSession;
	}

	public boolean getJson(){
		return json;
	}
	public void setJson(){
		this.json = json;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}

	public HashMap<String, Object> getSession() {
		return session;
	}

	public void setSession(HashMap<String, Object> session) {
		this.session = session;
	}

	public ModelView() {
		this.setData(new HashMap<>());
		this.setSession(new HashMap<>());
	}
	
	public ModelView(String url) {
		this.setUrl(url);
		this.setData(new HashMap<>());
		this.setSession(new HashMap<>());
	}
	
	public ModelView(String url,HashMap<String,Object> data) {
		this.setUrl(url);
		this.setData(new HashMap<>());
		this.setSession(new HashMap<>());
		this.setData(data);
	}
	
	public void addItem(String key,Object value) {
		if(!this.getData().containsKey(key)) {
			this.getData().put(key, value);
		}
	}

		public void addSession(String key,Object value) {
		// if(!this.getSession().containsKey(key)) {
			this.getSession().put(key, value);
		// }
	}
}
