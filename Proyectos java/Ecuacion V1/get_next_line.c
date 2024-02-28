char *ft_substr(char *alm, unsigned int start, size_t n)
{
    size_t  i;
    char    *res;

    i = 0;
    if (!alm)
        return (0);
    if (start > ft_strlen(alm))
    {
        res = malloc(sizeof(char) * (1));
        if (!res)
            return (NULL)
        res[0] = '\0';
        return (res);
    }
    if (ft_strlen(alm) - start < n)
        n = (ft_strlen(alm) - start);
    res = malloc(sizeof(char) (len + 1));
    if (!res)
        return (NULL);
    while (start < ft_strlen(alm) && i < n && alm[start])
        res[i++] = alm[start++];
    res[i] = '\0';
    return (res);
}