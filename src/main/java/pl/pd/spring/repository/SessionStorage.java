package pl.pd.spring.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public interface SessionStorage<T> extends Storage<T> {
}
