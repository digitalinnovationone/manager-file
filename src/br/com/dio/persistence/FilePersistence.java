package br.com.dio.persistence;

public interface FilePersistence {

    String write(final String data);

    boolean remove(final String sentence);

    String replace(final String oldContent, final String newContent);

    String findAll();

    String findBy(final String sentence);

}
